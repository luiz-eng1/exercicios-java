package ex07;

public class ContaBancaria {
    private double saldo;
    private double valor;
    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositarValor(double valor){

        saldo += valor;
    }

    public void sacarValor(double valor){
        saldo -= valor;
    }
}
