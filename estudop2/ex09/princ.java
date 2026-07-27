package ex09;
import java.util.InputMismatchException;
import java.util.Scanner;
public class princ {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria("lucas", 158.98);

        try{
            System.out.println("Diga o valor que quer sacar: ");
            double valor = sc.nextDouble();

            conta.sacar(valor);



            System.out.println("Diga o valor que quer depositar: ");
            valor = sc.nextDouble();

            conta.depositar(valor);



        }catch(InputMismatchException e){
            System.out.println("Digite valores numéricos");

        }catch(SaldoInsuficienteException e){
            System.out.println("Saldo insuficiente para saque");
        }
        finally{
            System.out.println("Programa encerrado");
        }
    }
}
