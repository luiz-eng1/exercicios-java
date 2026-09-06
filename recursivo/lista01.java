public class lista01 {

    public static int lista01(int a, int b){
        if(a-b < 0){
            return 0;
        }

        return 1 + lista01(a-b, b);
    }
}
