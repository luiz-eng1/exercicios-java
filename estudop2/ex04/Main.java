package ex04;
import java.util.ArrayList;
public class Main {
    public static void main(String [] args){
        ArrayList<Notificacao> notificacoes = new ArrayList<>();

        Notificacao n1 = new Email();
        Notificacao n2 = new SMS();

        notificacoes.add(n1);
        notificacoes.add(n2);

        for(Notificacao a : notificacoes){
            a.enviarMensagem("Isso foi uma mensagem.");
        }
    }
}
