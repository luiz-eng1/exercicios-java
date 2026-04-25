package ex06;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Pessoa p1 = new Pessoa();

        System.out.println("Digite o nome: ");
        String n = entrada.nextLine();
        p1.setNome(n);

        System.out.println("Digite a idade: ");
        int i = entrada.nextInt();
        p1.setIdade(i);



        p1.exibirDados();
    }
}
