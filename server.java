import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class server {
    public static void main(String[] args) throws RemoteException {
        Registry registry = LocateRegistry.createRegistry(1099);
        try {
            Naming.rebind("rmi://localhost:1099/Ola",new fatorialimp());

            System.out.println("Servidor levantou");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    
}
