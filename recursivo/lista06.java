public class lista06 {
    public static String lista06(int n){
        if(n < 2){
            return String.valueOf(n);
        }

        return lista06(n/2) + (n%2);
    }
}
