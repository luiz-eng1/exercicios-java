package ex08;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Qual seu nome ?");
            String nome = sc.nextLine();



            System.out.println("Qual sua idade ?");
            String idadeTexto = sc.nextLine();
            int idade = Integer.parseInt(idadeTexto);
            if(idade < 0){
                throw new SenhainvalidaException("a idade deve ser positiva");
            }


            System.out.println("Qual a senha ?");
            String senha = sc.nextLine();
            if(senha.length() < 6){
                throw new IllegalArgumentException("Senha deve ter mais que 6 caracteres");
            }

            Usuario user = new Usuario(nome, idade);
            System.out.println("Usuario criado com sucesso");

        }catch(NumberFormatException e){
            System.out.println("Idade inválida");

        }catch (IllegalArgumentException e ){
            System.out.println(e.getMessage());

        }finally{

            sc.close();
            System.out.println("Programa encerrado");
        }




    }
}
