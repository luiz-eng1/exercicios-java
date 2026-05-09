package ex03;
import java.util.HashMap;
public class Main {
    public static void main(String [] args){
        HashMap<String, Animal> animais = new HashMap<String, Animal>();

        Animal a1 = new Leao("lion");
        Animal a2 = new Macaco("monkey");

        animais.put("lion", a1);
        animais.put("monkey", a2);

        for(String chave : animais.keySet()){
            Animal a = animais.get(chave);

            System.out.println("Nome: " + a.getNome());
            a.emitirSom();
        }
    }
}
