public class lista14 {
    public int qtdeFormasSubirAte(int n){
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return 1;
        }

        return qtdeFormasSubirAte(n-1) + qtdeFormasSubirAte(n-2);
    }
}
