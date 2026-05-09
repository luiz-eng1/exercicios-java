package ex05;
import java.util.ArrayList;

 public abstract class Atividade implements Resumivel{

    protected String nome;
    protected String horarioInicio;
    protected int duracao;
    protected ArrayList<String> participantes;

    public Atividade(String nome, String horarioInicio, int duracao ){
        this.nome = nome;
        this.horarioInicio = horarioInicio;
        this.duracao = duracao;
        this.participantes = new ArrayList<>();
    }


    public void adicionarParticipantes(String participante){
        participantes.add(participante);
    }

    public void listarParticipantes(){
        for(String p : participantes){
            System.out.println(p);
        }
    }

    public abstract void exibirDetalhes();

    @Override
    public String gerarResumo(){
        return "Nome: " + nome + "Horário: " + horarioInicio +  "Duração: " + duracao + " min";
    }
}
