public class lista04 {
    public static int lista04(int a, int b){

        if(a == b){
            return a;
        }

        return b + lista04(a, b-1);
    }
}
