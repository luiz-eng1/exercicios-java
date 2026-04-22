package ex12;

public class Main {
    public static void main(String [] args){


        Ligavel dispositivo = new Smartphone();


        dispositivo.ligar();

        //verifica se também é conectável
        if(dispositivo instanceof Conectavel){
            Conectavel c = (Conectavel) dispositivo;
            c.conectarWifi();
        }

        dispositivo.desligar();
    }
}
