package ex11;

abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }
    public String getNome(){
        return nome;
    }
    public double getSalarioBase(){
        return salarioBase;
    }

    abstract double calcularSalario();
    abstract void exibirDados();


}
