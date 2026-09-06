public class lista05 {

    public static int lista05(String palavra, char x, int a){
        if(a == palavra.length()){
            return 0;
        }

        if(palavra.charAt(a) == x){
            return 1 + lista05(palavra, x ,a + 1);
        }

        return lista05(palavra, x, a+1);
    }
}
