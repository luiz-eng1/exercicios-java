public class lista07 {

    public static int lista07(int[] array, int n){
        if( n == 1){
            return 0;
        }

        int maior = lista07(array, n -1);

        if(array[n - 1] > array[maior]){
            return n-1;
        }
        return maior;
    }
}
