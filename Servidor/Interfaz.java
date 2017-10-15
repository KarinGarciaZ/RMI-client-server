import java.rmi.*;
public interface Interfaz extends java.rmi.Remote {
  public String saluda() throws java.rmi.RemoteException;
  public String saluda(String nombre) throws java.rmi.RemoteException;
  //public float operar(int x, float num1, float num2) throws java.rmi.RemoteException;
  public String operar(char x, int num) throws java.rmi.RemoteException;
  public int operarBinary(String num) throws java.rmi.RemoteException;
}