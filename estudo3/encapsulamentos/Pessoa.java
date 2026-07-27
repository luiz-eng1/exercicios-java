package encapsulamentos;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        setIdade(idade);
    }

    public void setIdade(int idade){
        if(idade < 0){
            System.out.println("idade nao pode ser negativa");
            return;
        }

        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
