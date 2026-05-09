package ex02;

public class PJ extends Funcionario{

    public PJ(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario(){
        return salarioBase + 1000;
    }
}
