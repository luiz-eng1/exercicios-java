public class lista02 {
    public static int lista02(int a, int b){
        if(b <= 0){
            return 1;

        }

        return a * lista02(a, b-1);

    }
}
