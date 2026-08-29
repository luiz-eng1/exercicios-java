public class contaDigitos {

    public static int contaDigitos(int n){
        if(n < 10){
            return 1;
        }

        return 1 + contaDigitos( (n) /10);

    }
}
