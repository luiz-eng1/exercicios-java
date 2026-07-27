package ex10;

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }

    public double calcularBonus(){
        return salario * 0.10;
    }
}
