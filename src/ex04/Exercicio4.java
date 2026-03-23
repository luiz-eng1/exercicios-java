package ex04;
import java.util.HashMap;
import java.util.Scanner;


public class Exercicio4 {
    HashMap<String, Double> produtos = new HashMap<>();
    Scanner entrada = new Scanner(System.in);
    public void setProdutos(HashMap<String, Double> produtos){
        this.produtos = produtos;
    }

    public HashMap<String, Double> getProdutos(){
        return produtos;
    }

    public void adicionarProdutos(){
        for(int i = 0; i < 5; i++){
            System.out.println("Digite o nome do produto: ");
            String nome = entrada.nextLine();

            System.out.println("Digite o preco do produto: ");
            Double preco = entrada.nextDouble();
            entrada.nextLine();


            produtos.put(nome, preco);
        }
    }

    public void mostrarProdutos(){
        for(String chave : produtos.keySet()){
            System.out.print(chave + " = " + produtos.get(chave));
        }
    }

    public void mostrarPrecos(){
        for(Double preco : produtos.values()){
            System.out.println(preco);
        }
    }

    public void mostrarTam(){
        System.out.println("O tamanho do hashmap é" + produtos.size());
    }
}
