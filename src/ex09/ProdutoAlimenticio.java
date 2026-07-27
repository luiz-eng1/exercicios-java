package ex09;

public class ProdutoAlimenticio extends Produto{
    private String dataValidade;

    public ProdutoAlimenticio(String nome, double preco, String dataValidade){
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    public void setDataValidade(String dataValidade){
        this.dataValidade = dataValidade;
    }

    public String getDataValidade(){
        return dataValidade;
    }

    @Override
    public void exibirInfo(){
        System.out.println("Nome: " + nome + "Preço: R$" + preco + "Data de validade: " + dataValidade);
    }
}
