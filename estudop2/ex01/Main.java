package ex01;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){

         ArrayList<Forma> formas = new ArrayList<>();

        Forma retangulo1 = new Retangulo(3, 6);
        Forma retangulo2 = new Retangulo(9, 3);

        Forma circulo1 = new Circulo(5);
        Forma circulo2 = new Circulo(4.23);

        formas.add(retangulo1);
        formas.add(retangulo2);
        formas.add(circulo1);
        formas.add(circulo2);

        for(Forma a : formas){
           System.out.println(a.calcularArea());
        }
    }
}
