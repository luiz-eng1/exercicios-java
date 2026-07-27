package ex09;
import java.util.ArrayList;
public class Main {
    public static void main(String [] args){
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto copo = new Produto("Copo", 1.50);
        Produto fone = new ProdutoEletronico("Fone", 50.99, 3);
        Produto biscoito = new ProdutoAlimenticio("Biscoito", 5.99, 11/11/2030);

        listaProdutos.add(copo);
        listaProdutos.add(fone);
        listaProdutos.add(biscoito);

        //percorrer (forma 1)

        for(int i = 0; i < listaProdutos.size(); i++){
            Produto p = listaProdutos.get(i);
            p.exibirInfo();
        }

        // percorrer (forma 2)
        for(Produto p : listaProdutos){
            p.exibirInfo();
        }
    }
}
