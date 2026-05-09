package ex05;

public class Oficina extends Atividade{
    protected String materiais;
    protected String instrutores;

    public Oficina(String nome, String horarioInicio, int duracao, String materiais, String instrutores){
        super(nome, horarioInicio, duracao);
        this.materiais = materiais;
        this.instrutores = instrutores;
    }

    public void setMateriais(String materiais){
        this.materiais = materiais;
    }
    public void setInstrutores(String instrutores){
        this.instrutores = instrutores;
    }
    public String getMateriais(){
        return materiais;
    }
    public String getInstrutores(){
        return instrutores;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println(gerarResumo());
        System.out.println("Materiais: "+ materiais + "Instrutores: "+ instrutores);

    }
}
