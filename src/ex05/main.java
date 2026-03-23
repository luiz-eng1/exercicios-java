package ex05;

public class main {
    public static void main(String [] args){
        Pessoa p1 = new Pessoa();

        p1.setNome("luizin");
        p1.setIdade(20);

        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
    }
}
