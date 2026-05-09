package ex04;

public class SMS implements Notificacao{

    @Override
    public void enviarMensagem(String msg){
        System.out.println(" MENSAGEM SMS: " + msg);
    }
}
