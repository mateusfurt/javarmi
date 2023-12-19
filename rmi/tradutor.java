import java.rmi.Remote;
import java.rmi.RemoteException;

public interface tradutor extends Remote {

    String traduzir(String txt) throws RemoteException;
}