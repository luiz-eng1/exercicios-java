package ex10;

public class Gerente extends Funcionario{
    private double bonusFixo;

    public Gerente(String nome, double salario, double bonusFixo){
        super(nome, salario);
        this.bonusFixo = bonusFixo;
    }

    public void setBonusFixo(double bonusFixo){
        this.bonusFixo = bonusFixo;
    }
    public double getBonusFixo(){
        return bonusFixo;
    }

    @Override
    public double calcularBonus(){
        return salario * 0.15 + bonusFixo;
    }
}
