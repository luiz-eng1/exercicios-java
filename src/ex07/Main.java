    package ex07;
    import java.util.Scanner;
    public class Main {
        public static void main(String [] args){
            Scanner entrada = new Scanner(System.in);
            double valor;
            ContaBancaria conta = new ContaBancaria(0);

            System.out.println("Digite o valor que deseja depositar: ");
            valor = entrada.nextDouble();
            conta.depositarValor( valor);

            entrada.nextLine();
            System.out.println("Digite o valor que deseja depositar: ");
            valor = entrada.nextDouble();
            conta.sacarValor( valor);

            System.out.print("O saldo da conta e: "+ conta.getSaldo());
        }
    }
