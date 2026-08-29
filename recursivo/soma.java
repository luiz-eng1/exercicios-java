public class soma {

    public static int soma(int n){

        if(n <= 0){
            return 0;
        }

        return n + soma(n-1);
    }
}
