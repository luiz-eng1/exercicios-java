package ex11;

public class Main {
    public static void main(String [] args){
        Funcionario f1 = new Gerente( "Anderson", 3800);
        Funcionario f2 = new Desenvolvedor("Julio", 8800);

        f1.calcularSalario();
        f2.calcularSalario();
        f1.exibirDados();
        f2.exibirDados();
    }
}
