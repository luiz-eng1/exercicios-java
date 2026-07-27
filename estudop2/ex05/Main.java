package ex05;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        ArrayList<Atividade> atividades = new ArrayList<>();

        int opcao;



        do{

            System.out.println("1. Cadastrar atividade");
            System.out.println("2. Listar atividades");
            System.out.println("3. Adicionar avaliação");
            System.out.println("4. Exibir média das avaliações");
            System.out.println("5. Listar participantes");
            System.out.println("6. Sair");


            opcao = entrada.nextInt();
            entrada.nextLine();

            switch(opcao){

                case 1:
                    System.out.println("1-Palestra 2-Oficina 3-MesaRedonda 4-MiniCurso");
                    int tipo = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("Nome: ");
                    String nome = entrada.nextLine();

                    System.out.print("Horario: ");
                    String horario = entrada.nextLine();

                    System.out.print("Duraçao: ");
                    int duracao = entrada.nextInt();
                    entrada.nextLine();

                    switch (tipo) {
                        case 1:
                            System.out.print("Tema: ");
                            String tema = entrada.nextLine();
                            System.out.print("Palestrante: ");
                            String palestrante = entrada.nextLine();
                            atividades.add(new Palestra(nome, horario, duracao, tema, palestrante));
                            break;

                        case 2:
                            System.out.print("Instrutores: ");
                            String instrutores = entrada.nextLine();
                            System.out.print("Materiais: ");
                            String materiais = entrada.nextLine();
                            atividades.add(new Oficina(nome, horario, duracao, instrutores, materiais));
                            break;

                        case 3:
                            System.out.print("Moderador: ");
                            String moderador = entrada.nextLine();
                            System.out.print("Debatedores: ");
                            String debatedores = entrada.nextLine();
                            atividades.add(new MesaRedonda(nome, horario, duracao, moderador, debatedores));
                            break;

                        case 4:
                            System.out.print("Instrutor: ");
                            String instrutor = entrada.nextLine();
                            System.out.print("Carga horária: ");
                            int carga = entrada.nextInt();
                            atividades.add(new MiniCurso(nome, horario, duracao, instrutor, carga));
                            break;
                    }
                    break;

                case 2:
                    for (Atividade a : atividades) {
                        System.out.println("--- " + a.getClass().getSimpleName() + " ---");
                        System.out.println(a.gerarResumo());
                    }
                    break;

                case 3:
                    for (int i = 0; i < atividades.size(); i++) {
                        if (atividades.get(i) instanceof Avaliavel) {
                            System.out.println(i + " - " + atividades.get(i).nome);
                        }
                    }

                    System.out.print("Escolha: ");
                    int idx = entrada.nextInt();

                    if (atividades.get(idx) instanceof Avaliavel) {
                        System.out.print("Nota: ");
                        double nota = entrada.nextDouble();
                        ((Avaliavel) atividades.get(idx)).adicionarAvaliacao(nota);
                    }
                    break;

                case 4:
                    for (Atividade a : atividades) {
                        if (a instanceof Avaliavel) {
                            double media = ((Avaliavel) a).calcularAvaliacaoMedia();
                            System.out.println(a.nome + " Media: " + media);
                        }
                    }
                    break;

                case 5:
                    for (int i = 0; i < atividades.size(); i++) {
                        System.out.println(i + " - " + atividades.get(i).nome);
                    }

                    System.out.print("Escolha: ");
                    int escolha = entrada.nextInt();

                    atividades.get(escolha).listarParticipantes();
                    break;

            }



        }while(opcao != 6);


    entrada.close();


    }
}
