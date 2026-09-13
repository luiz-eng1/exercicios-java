public class lista13{
    public boolean ehPalindromo(String s){
        if(s.length() <= 1){
            return true;
        }

        if(s.charAt(0) != s.charAt(s.length() -1)){
            return false;
        }
        return ehPalindromo(s.substring(1, s.length() -1));

    }
}
