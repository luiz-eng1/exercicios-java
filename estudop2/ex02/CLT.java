package ex02;

public class CLT extends Funcionario{

    public CLT(double salarioBase, String nome){
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario(){
        return salarioBase + 500;
    }


}
