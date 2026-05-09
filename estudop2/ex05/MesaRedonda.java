package ex05;

public class MesaRedonda extends Atividade{
    private String moderador;
    private String debatedores;

    public MesaRedonda(String nome, String horarioInicio, int duracao, String moderador, String debatedores){
        super(nome, horarioInicio, duracao);
        this.moderador = moderador;
        this.debatedores = debatedores;
    }

    public void setModerador(String moderador){
        this.moderador = moderador;
    }
    public void setDebatedores(String debatedores){
        this.debatedores = debatedores;
    }
    public String getModerador(){
        return moderador;
    }
    public String getDebatedores(){
        return debatedores;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println(gerarResumo());
        System.out.println("Moderador: " + moderador + "Debatedores: " + debatedores);
    }
}
