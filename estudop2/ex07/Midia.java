package ex07;

abstract class Midia {
    protected String titulo;
    protected int duracao;
    protected Classificacao cls;

    public Midia(String titulo, int duracao, Classificacao cls){
        this.titulo = titulo;
        this.duracao = duracao;
        this.cls = cls;
    }

    public String getTitulo(){return titulo;}
    public int getDuracao(){return duracao;}
    public Classificacao getCls(){return cls;}

    abstract void exibirDetalhes();
}
