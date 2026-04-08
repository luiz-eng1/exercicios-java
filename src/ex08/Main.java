package ex08;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Pessoa aluno1 = new Aluno("Luiz", 19, 881470);
        Pessoa professor1 = new Professor("Adalberto", 67, "ciencias");

        pessoas.add(aluno1);
        pessoas.add(professor1);

        //percorrer
        for(int i =0; i < pessoas.size(); i++){
            Pessoa p = pessoas.get(i);
            p.apresentar();
        }

        //percorrer (segunda forma)
        for(Pessoa p : pessoas){
            p.apresentar();
        }

    }
}
