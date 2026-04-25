package ex05;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio5 {
    Scanner entrada = new Scanner(System.in);
    private ArrayList<String> alunos = new ArrayList<String>();

    //construtor
    public Exercicio5(){}

    //set
    public void setAlunos(ArrayList<String> alunos) {
        this.alunos = alunos;
    }

    //get
    public ArrayList<String> getAlunos(){
        return alunos;
    }

    public void adicionarAluno(){
        System.out.println("Digite o nome do aluno que deseja adicionar: ");
        String nome = entrada.nextLine();
        alunos.add(nome);
    }

    public void listarAlunos(){
        System.out.println("Alunos: ");
        for(int i = 0; i < alunos.size(); i++){
            System.out.println("N: " + i + " | Aluno: " + alunos.get(i));
        }
    }

    public void removeAluno(){
        System.out.println("Digite o nome do aluno que deseja excluir: ");
        String nome = entrada.nextLine();
        alunos.remove(nome);
    }

    public void verificaAluno(){
        System.out.println("Digite o nome do aluno que deseja verificar: ");
        String nome = entrada.nextLine();
        alunos.contains(nome);
    }
}
