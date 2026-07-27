package ex11;

public class Desenvolvedor extends Funcionario{


    public Desenvolvedor(String nome, double salarioBase){
        super(nome, salarioBase);

    }


    @Override
    double calcularSalario(){

        return salarioBase + 500;
    }
    void exibirDados(){
        System.out.println("Nome: " + nome + "Salario base: " + salarioBase  + "Salario total: " + calcularSalario());
    }
}
