package ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

    private ArrayList<String> nomes = new ArrayList<String>();
    Scanner entrada = new Scanner(System.in);


    //construtor
    public Exercicio1(ArrayList<String> nomes){
        this.nomes = nomes;
    }

    public void setNome(ArrayList<String> nomes){
        this.nomes = nomes;
    }

    public ArrayList<String> getNome(){
        return nomes;
    }

    public void adicionarNome(){
        for(int i= 0; i < 5; i++){
            System.out.print("Adicione um nome: ");
            String nome = entrada.nextLine();
            nomes.add(nome);
        }
    }

    public void mostrarTam(){
        nomes.size();
        nomes.get(2);
        nomes.contains("João");
        nomes.indexOf("Diana");
        nomes.remove("Luiz");

        System.out.println("Tamanho: "+ nomes.size());
        System.out.println("Posição 2" + nomes.get(2));
        System.out.println("Contém João "+ nomes.contains("João"));
        System.out.println("Indice de Diana" + nomes.indexOf("Diana"));

    }

    public void listaFinal(){
        for(int i = 0; i < nomes.size(); i++){
            System.out.printf("Nome %d é %s", i, nomes.get(i));
        }
    }

    public void fecharScanner(){
        entrada.close();
    }
}
