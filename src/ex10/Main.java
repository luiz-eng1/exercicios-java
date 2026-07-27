package ex10;
import java.util.HashMap;
public class Main {
    public static void main(String [] args){
        HashMap<Integer, Funcionario> lista = new HashMap<Integer, Funcionario>();

        Funcionario gerente1 = new Gerente("Francisco", 7.867, 780.65);
        Funcionario dev1 = new Desenvolvedor("luiz", 20.754, "Java");
        Funcionario func1 = new Funcionario("Welington", 5.089);

        lista.put(0, gerente1);
        lista.put(1, dev1);
        lista.put(2, func1);

        for(int ID : lista.keySet()){
            Funcionario f = lista.get(ID);

            System.out.println("Id: " + ID);
            System.out.println("Nome: " + f.nome);
            System.out.println("Salario: " + f.salario);
            System.out.println("Bonus: " + f.calcularBonus());
        }
    }
}
