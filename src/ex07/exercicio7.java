package ex07;
import java.util.Scanner;
import java.util.HashMap;
public class exercicio7 {
    Scanner entrada = new Scanner(System.in);
    private HashMap<String, Double> produtos = new HashMap<String, Double>();

    public exercicio7(){}

    public void setProdutos(HashMap<String, Double> produtos){
        this.produtos = produtos;
    }

    public HashMap<String, Double> getProdutos(){
        return produtos;
    }

    public void adicionarProdutos(){

            System.out.println("Digite o produto que quer adicionar: ");
            String nome = entrada.nextLine();

            System.out.println("Digite o valor do produto: ");
            double valor = entrada.nextDouble();
            entrada.nextLine();

            produtos.put(nome, valor);

    }

    public void listar(){
        for(String nome : produtos.keySet()){
            System.out.println(nome + "- R$" + produtos.get(nome));
        }
    }

    public void buscarPreco(){
        System.out.println("Digite o produto que deseja buscar o preço: ");
        String n = entrada.nextLine();
       if(produtos.containsKey(n)){
           double preco = produtos.get(n);
           System.out.println("Preço: R$"+ preco);
       }else{
           System.out.println("Produto não encontrado.");
       }

    }


    public void removeProduto(){
        System.out.println("Digite o nome do produto que deseja remover: ");
        String n = entrada.nextLine();

        if(produtos.containsKey(n)){
            produtos.remove(n);
            System.out.println("Produto removido.");
        }else{
            System.out.println("Produto não encontrado.");
        }
    }
}
