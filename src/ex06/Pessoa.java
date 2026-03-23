package ex06;

public class Pessoa {
    private String nome;
    private Endereco endereco;

    //construtor
    public Pessoa(){

    }

    //setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    //getters

    public String getNome(){
        return nome;
    }

    public Endereco getEndereco(){
        return endereco;
    }
}
