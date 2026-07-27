package ex07;

public class Serie extends Midia{
    private int episodios;

    public Serie(int episodios, String titulo, int duracao, Classificacao cls){
        super(titulo, duracao, cls);
        this.episodios = episodios;
    }

    public int getEpisodios(){return episodios;}

    @Override
    public void exibirDetalhes(){
        System.out.println("Episodios: " + episodios + "Titulo: " + getTitulo() + "Duracao: " + getDuracao() + "Classificacao: " + getCls());
    }
}
