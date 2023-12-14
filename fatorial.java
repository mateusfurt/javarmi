import java.rmi.Remote;
import java.rmi.RemoteException;

public interface fatorial extends Remote {

    int fatorar(int num) throws RemoteException;
}