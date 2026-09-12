public class lista08 {

    public static void lista08(int a0, int b, int n){

        if(n == 0){
            return;
        }
        System.out.println(a0);
        lista08(a0 + b, b, n-1 );
    }
}
