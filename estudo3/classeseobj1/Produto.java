package classeseobj1;

public class Produto {
    private String nome;
    private double preco;
    private int qtd;

    public Produto(String nome, double preco, int qtd){
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    // setters
    public void setNome (String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setQtd(int qtd){
        this.qtd = qtd;
    }

    //getters
    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getQtd(){
        return qtd;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome + "Preço: " + preco + "Quantidade: " + qtd);
    }

    public double valorTotalEstoque(){
        return preco * qtd;
    }
}
