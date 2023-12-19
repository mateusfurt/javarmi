import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.io.FileWriter;
import java.io.IOException;

public class tradutorimp extends UnicastRemoteObject implements tradutor{

    protected tradutorimp() throws RemoteException {
        super();
    }

    @Override
    public String traduzir(String txt) throws RemoteException {
        String res = "";
        int i, pos = -1;
        boolean achou = false;
        String[] ptbr = {"bom dia", "boa noite", "ciencia", "computador", "ferias", "teclado", "celular", "artigo"};
        String[] enus = {"good morning", "good night", "science", "computer", "vacation", "keyboard", "cell phone", "article"};

        for (i = 0; i < ptbr.length; i++) {
            if (ptbr[i].equals(txt)) {
                pos = i; // Armazena a posição quando a palavra é encontrada
                achou = true;
                break; // Sai do loop quando a palavra é encontrada
            }
        }
        if (pos != -1) {
            res = enus[pos];
            
        }
        pos = -1;
        for (i = 0; i < enus.length; i++) {
            if (enus[i].equals(txt)) {
                pos = i; // Armazena a posição quando a palavra é encontrada
                achou = true;
                break; // Sai do loop quando a palavra é encontrada
            }
        }
        if (pos != -1) {
            res = ptbr[pos];
        }
        if (!achou){
            res = "palavra nao reconhecida";
        }
        try {
            FileWriter writer = new FileWriter("resultado.txt", false);
            writer.write(res);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(res);
        return res;
    }

    
}