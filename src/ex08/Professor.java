package ex08;

public class Professor extends Pessoa{

    private String disciplina;

    public Professor(String nome, int idade, String disciplina){
        super(nome, idade);
        this.disciplina = disciplina;

    }

    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
    public String getDisciplina(){
        return disciplina;
    }

    @Override
    public void apresentar(){
        System.out.println("Olá! Eu sou o professor " + nome + "e leciono a disciplina " + disciplina + ".");
    }
}
