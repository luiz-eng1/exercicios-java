package ex09;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular(){
        return titular;
    }
    public double getSaldo(){
        return saldo;
    }

    public void depositar(double valor){
        if(valor < 0){
            throw new SaldoInsuficienteException("Não é possivel depositar valores negativos");
        }
        saldo += valor;
    }

    public void sacar(double valor){

        if(valor > getSaldo() || valor < 0){
            throw new SaldoInsuficienteException("Valor insuficiente para saque");
        }

        saldo -= valor;
    }

    public void mostrarValor(){
        System.out.println("O saldo da conta é: " + saldo);
    }
}
