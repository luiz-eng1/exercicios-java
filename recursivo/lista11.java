public class lista11 {
    public int lista11(int n, int k){
        if(k == 0){
             return -1;
        }
        if(k == n){
            return 1;
        }
        return lista11(n-1, k -1) + lista11(n-1, k);
    }
}
