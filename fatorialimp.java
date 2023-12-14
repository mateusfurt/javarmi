import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class fatorialimp extends UnicastRemoteObject implements fatorial{

    protected fatorialimp() throws RemoteException {
        super();
    }

    public int fatorar(int num) throws RemoteException {
        int res = 1;
        for(int i = 1;i<=num; i++){
            res = res*i;
        }

        return res;
    }

    
}