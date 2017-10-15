public class Servidor {
  public static void main(String[] args) {
    try {
      Implementacion objRemoto = new Implementacion("rmi://localhost:2002/saluda");
    } catch(Exception e) { }
  }
}