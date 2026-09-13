public class lista12 {
    public double calcula(int a, int n){
        if(n == 1){
            return a;
        }

        if(n %2 == 0){
            double r =  calcula(a, n/2) ;
            return r * r;
        } else{
            double r =  calcula(a, n/2);
            return a * (r * r);
        }
    }
}
