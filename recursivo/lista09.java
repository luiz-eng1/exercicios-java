public class lista09 {
    public static double lista09(int n){
        if(n == 1){
            return 1;
        }

        if(n % 2 == 0 ){
            return lista09(n -1) - (1.0 / n);
        }else{
            return lista09(n -1) + (1.0 / n);
        }


    }
}
