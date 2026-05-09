package ex05;
import java.util.ArrayList;
public class MiniCurso extends Atividade implements Avaliavel{
    private String instrutor;
    private int cargaHoraria;
    private ArrayList<Double> notas;
    public MiniCurso(String nome, String horarioInicio, int duracao, String instrutor, int cargaHoraria){
        super(nome, horarioInicio,  duracao);
        this.instrutor = instrutor;
        this.cargaHoraria = cargaHoraria;
        this.notas = new ArrayList<>();
    }

    public void setInstrutor(String instrutor){
        this.instrutor = instrutor;
    }
    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    public String getInstrutor(){
        return instrutor;
    }
    public int getCargaHoraria(){
        return cargaHoraria;
    }

    @Override
    public double calcularAvaliacaoMedia(){
        if(notas.isEmpty()){
            return 0;
        }

        double soma = 0;
        for(double a : notas){
            soma += a;
        }

        return soma/notas.size();
    }

    @Override
    public void adicionarAvaliacao(double nota){
        notas.add(nota);
    }

    @Override
    public void exibirDetalhes(){
        System.out.println(gerarResumo());
        System.out.println("Instrutor: "+ instrutor + "Carga horaria: "+ cargaHoraria);
    }

}