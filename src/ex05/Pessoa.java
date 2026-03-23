package ex05;

public class Pessoa {
    private String nome;
    private int idade;

    // construtor
    public Pessoa(){

    }

    //setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    //getters
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }
}
