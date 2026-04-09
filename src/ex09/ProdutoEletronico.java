package ex09;

public class ProdutoEletronico extends Produto{
    private int garantia;

    public ProdutoEletronico(String nome, double preco, int garantia){
        super(nome, preco);
        this.garantia = garantia;
    }

    public void setGarantia(int garantia){
        this.garantia = garantia;
    }

    public int getGarantia(){
        return garantia;
    }

    @Override
    public void exibirInfo(){
        System.out.println("Nome: " + nome + " Preço: R$" + preco + " Garantia: " + garantia);
    }
}
