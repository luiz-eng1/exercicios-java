package ex04;

public class Email implements Notificacao{


    @Override
    public void enviarMensagem(String msg){
        System.out.println("EMAIL MENSAGEM: " + msg);
    }
}
