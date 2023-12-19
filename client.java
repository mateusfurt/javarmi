import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            tradutor stub = (tradutor) Naming.lookup("rmi://localhost:1099/Ola");  

            while(true){
                System.out.println("Digite uma palavra: ");
                String txt = scanner.nextLine();
                if (txt.equals("fechar")){
                    break;
                }
                System.out.println(stub.traduzir(txt));  
            }
            
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}

