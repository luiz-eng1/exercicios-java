package ex02;
import java.util.ArrayList;
public class Main {
    public static void main(String [] args){
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        Funcionario f1 = new CLT(1400, "lila");
        Funcionario f2 = new PJ("thiago", 3400);
        Funcionario f3 = new PJ("kaiki", 5000);

        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);

        for(Funcionario a : funcionarios){
            System.out.println("Nome: " + a.getNome() + "Salario: " + a.calcularSalario() );
        }
    }
}
