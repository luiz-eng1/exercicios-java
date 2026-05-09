package ex01;

public class Retangulo extends Forma{
    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base){
        this.base = base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }

    @Override
    public double calcularArea(){
        return base*altura;
    }

}
