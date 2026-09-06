public class lista03 {

    public static void lista03(String palavra, int index){
        if(index < 0){
            return;
        }
        if(index == palavra.length()){
            index = index-1;
        }

        System.out.println(palavra.charAt(index));
        lista03(palavra, index-1);
    }
}
