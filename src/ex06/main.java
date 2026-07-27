package ex06;

public class Main {
    public static void main(String [] args){
        //criar endereco
        Endereco meuendereco = new Endereco();
        meuendereco.setRua("raul soares");
        meuendereco.setCidade("contagem");

        //criar pessoa
        Pessoa p1 = new Pessoa();
        p1.setNome("luizin");


        //associar endereço
        p1.setEndereco(meuendereco);

        //mostrar dados
        System.out.print("Nome: " + p1.getNome());
        System.out.print("Rua: "+ p1.getEndereco().getRua());
        System.out.print("Cidade: "+ p1.getEndereco().getCidade());
    }

}
