package ex03;
import java.util.HashMap;
import java.util.Scanner;

public class Exercicio3 {
    private HashMap<String, Integer> alunos = new HashMap<>();
    Scanner entrada = new Scanner(System.in);


    public void setNome(HashMap<String, Integer> alunos){
        this.alunos = alunos;
    }

    public HashMap<String, Integer> getAlunos(){
        return alunos;
    }

    public void adicionarAlunos(){
        for(int i =0; i < 3; i++){
            System.out.print("Digite o nome do aluno " + i + ":");
            String nome = entrada.nextLine();

            alunos.put(nome, i);
        }
    }

    public void mostrarMatricula(){
        System.out.print("Digite a matricula: ");
        int mat = entrada.nextInt();

        System.out.println("Nome: " + alunos.get(mat));
    }

    public void verificaChave(){
        System.out.print("Digite a matricula: ");
        int mat = entrada.nextInt();

        System.out.println("Existe "+ alunos.containsKey(mat));
    }

    public void removeAluno(){
        System.out.print("Digite a matricula: ");
        int mat = entrada.nextInt();

        alunos.remove(mat);
    }

    public void percorreHashMap(){
        for(String chave : alunos.keySet()){
            System.out.println(chave  + "=" + alunos.get(chave));
        }
    }

}
