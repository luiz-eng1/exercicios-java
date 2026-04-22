package ex12;

public class Smartphone implements Ligavel, Conectavel{
    private boolean ligado;
    private boolean conectado;

    @Override
    public void ligar(){
        ligado = true;
        System.out.println("O smartphone está ligado");
    }

    @Override
    public void desligar(){
        ligado = false;
        conectado = false;
        System.out.println("O smartphone está desligado");
    }

    @Override
    public void conectarWifi(){
        if(ligado){
            conectado = true;
            System.out.println("O smartphone está conectado ao wifi");
        }else{
            conectado = false;
            System.out.println("O smartphone não está conectado ao wifi: smartphone desligado");
        }
    }
}
