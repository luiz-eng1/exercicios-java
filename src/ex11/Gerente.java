package ex11;

    public class Gerente extends Funcionario{

    public Gerente(String nome, double salarioBase){
        super(nome, salarioBase);

    }



    @Override
    double calcularSalario(){

        return salarioBase *1.2;
    }

    void exibirDados(){
        System.out.println("Nome: " + nome + "Salario base: " + salarioBase + "Salario final: " + calcularSalario());
    }
}
