package ex01;

public class Circulo extends Forma{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }
    public void setRaio(double raio){
        this.raio = raio;
    }
    public double getRaio(double raio){
        return raio;
    }

    @Override
    public double calcularArea(){
        return 3.14 *(raio*raio);
    }
}
