import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {
    public String reverse(String ch) throws RemoteException;
    public char minChar(String ch) throws RemoteException;
    public String upperLower(String ch) throws RemoteException;
}
