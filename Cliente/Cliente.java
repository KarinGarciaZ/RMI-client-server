import java.util.Scanner;
public class Cliente {

    public static void main(String[] args) {

        try {
          Interfaz objRemoto = (Interfaz) java.rmi.Naming.lookup("rmi://localhost:2002/saluda");    
          Scanner leer = new Scanner(System.in);
          char opc;
          int num1;
          String num2;
          System.out.println("B.- Decimal a binario");
          System.out.println("O.- Decimal a octal");
            System.out.println("H.- Decimal a hexagonal");
            System.out.println("X.- Binario a decimal");
            System.out.println("S.- Salir");
            opc = leer.next().charAt(0);

          while(opc != 'S' && opc != 's'){         

            if (opc != 'X' && opc != 'x'){    
                System.out.println("Ingrese su numero decimal a convertir: ");                        
                num1 = leer.nextInt();
                if(num1 < 65365 && num1 > 0)
                    System.out.println(objRemoto.operar(opc, num1));
            }else{
                System.out.println("Ingrese su numero binario para convertir a decimal: ");            
                num2 = leer.nextLine();
                System.out.println(objRemoto.operarBinary(num2));
            }           

            System.out.println("B.- Decimal a binario");
            System.out.println("O.- Decimal a octal");
            System.out.println("H.- Decimal a hexagonal");
            System.out.println("X.- Binario a decimal");
            System.out.println("S.- Salir");
            opc = leer.next().charAt(0);
            }
          

          /*System.out.println(objRemoto.saluda());          
            System.out.println(objRemoto.saluda("Oscar"));*/
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}