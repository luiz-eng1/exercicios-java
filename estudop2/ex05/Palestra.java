package ex05;
import java.util.ArrayList;
public class Palestra extends Atividade implements Avaliavel{


    private String tema;
    private String palestrante;
    private ArrayList<Double> avaliacoes;

    public Palestra(String nome, String horarioInicio, int duracao,String tema, String palestrante){
        super(nome, horarioInicio, duracao);
        this.tema = tema;
        this.palestrante = palestrante;
        this.avaliacoes = new ArrayList<>();
    }

    public void setTema(String tema){
        this.tema = tema;
    }
    public void setPalestrante(String palestrante){
        this.palestrante = palestrante;
    }
    public String getPalestrante(){
        return palestrante;
    }
    public String getTema(){
        return tema;
    }



    @Override
    public void exibirDetalhes(){
        System.out.println(gerarResumo());
        System.out.println("Tema: " + tema + "Palestrante: " + palestrante);
    }

    @Override
    public double calcularAvaliacaoMedia(){
        if(avaliacoes.isEmpty()){
            return 0;
        }

        double soma = 0;
        for(double nota : avaliacoes){
            soma += nota;
        }

        return soma/ avaliacoes.size();
    }

    @Override
    public void adicionarAvaliacao(double nota){
        avaliacoes.add(nota);
    }
}
