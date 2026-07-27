package ex07;
import java.util.ArrayList;
import java.util.Iterator;
public class Main {
    public static void main(String[] args){
        ArrayList<Midia> midias = new ArrayList<>();

        Midia filme1 = new Filme("jackson", "piratas do caribe", 100, Classificacao.LIVRE);
        Midia serie1 = new Serie(12, "stranger", 89, Classificacao.MAIOR_18);

        midias.add(filme1);
        midias.add(serie1);

        Iterator<Midia> it = midias.iterator();

        while(it.hasNext()){

            Midia m = it.next();

            if(m instanceof Filme){
                System.out.println("Diretor: " + ((Filme) m).getDiretor());
            }

            if(m instanceof Serie){
                System.out.println("Episodios: " + ((Serie) m).getEpisodios());
            }

            if(m.getCls() == Classificacao.MAIOR_18){
                it.remove();
            }

            for(Midia a : midias){
                a.exibirDetalhes();
            }
        }
    }
}
