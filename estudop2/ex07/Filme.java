package ex07;

public class Filme extends Midia{
    private String diretor;

    public Filme(String diretor, String titulo, int duracao, Classificacao cls){
        super(titulo, duracao, cls);
        this.diretor = diretor;
    }
    public String getDiretor(){return diretor;}

    @Override
    public void exibirDetalhes(){
        System.out.println("Diretor: " + diretor + " Titulo: " + getTitulo() + " Duracao: " + getDuracao() + " Classificacao:  " + getCls());
    }
}
