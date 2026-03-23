package ex02;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercicio2 {
    private ArrayList<Integer> numeros = new ArrayList<Integer>();
    Scanner entrada = new Scanner(System.in);


    public void setNumeros(ArrayList<Integer> numeros){
        this.numeros = numeros;
    }

    public ArrayList<Integer> numeros(){
        return numeros;
    }

    public void adicionarNumeros(){
        for(int i =0; i<numeros.size(); i++){
            System.out.print("Digite os numeros: ");
            int numero = entrada.nextInt();
            numeros.add(numero);
        }
    }

    public void removerNumeros(){
        numeros.remove(1);
        numeros.remove(3);

        numeros.trimToSize();
    }

    public void limparArray(){

        System.out.println("O tamanho é" + numeros.size());
        numeros.clear();
        System.out.println("O tamanho é" + numeros.size());
    }

 }
