import java.rmi.*;

public class Implementacion
extends java.rmi.server.UnicastRemoteObject
implements Interfaz {

  public Implementacion(String nombre) throws java.rmi.RemoteException {
    super();

    try {
      System.out.println("Rebind en objeto remoto: " + nombre);
      java.rmi.Naming.rebind(nombre, this);
    } catch(Exception e) { }

  }

 public String saluda() throws java.rmi.RemoteException {
   return "Hola mundo";
 }

 public String saluda(String nombre) throws java.rmi.RemoteException {
   return "Hola " + nombre + "!";
 }/*
 
 public float operar(int x, float num1, float num2) throws java.rmi.RemoteException {
   float res = 0;
   res = (x == 1)? num1 + num2: res;
   res = (x == 2)? num1 - num2: res;
   res = (x == 3)? num1 * num2: res;
   res = (x == 4)? num1 / num2: res;
   return res;
 }*/

 public int operarBinary(String num) throws java.rmi.RemoteException{
   return Integer.parseInt(num, 2);
 }

 public String operar(char x, int num) throws java.rmi.RemoteException{
   String res = "";
   res =  (x == 'B')? Integer.toBinaryString(num): res;
   res =  (x == 'O')? Integer.toOctalString(num): res;
   res =  (x == 'H')? Integer.toHexString(num): res;
   return res;
 }
}
