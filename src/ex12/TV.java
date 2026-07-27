package ex12;

public class TV implements Ligavel{
    private boolean ligado;

    @Override
    public void ligar(){
        ligado = true;
        System.out.println("A TV está ligada.");
    }

    @Override
    public void desligar(){
        ligado = false;
        System.out.println("A TV está desligada;");
    }
}
