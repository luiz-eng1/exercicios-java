package ex06;

public class Pessoa {
    private String nome;
    private int idade;


    public Pessoa(){

    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }

    public void exibirDados(){
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
    }
}
