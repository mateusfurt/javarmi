import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class server {
    public static void main(String[] args) throws RemoteException {
            System.setProperty("java.rmi.server.hostname", "localhost");
        Registry registry = LocateRegistry.createRegistry(1099);
        try {
            Naming.rebind("rmi://localhost:1099/Ola",new tradutorimp());

            System.out.println("Servidor levantou");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    
}
