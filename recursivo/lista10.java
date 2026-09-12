public class lista10 {
    public static double lista10(int n){
        if(n == 1){
            return -1.0/2;
        }

        if(n % 2 == 0){
            return lista10(n - 1) + 1.0/(2*n);
        }else {
            return lista10(n - 1) - 1.0/(2*n);

        }

    }
}
