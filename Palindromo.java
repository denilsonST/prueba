

public class Palindromo
{
   public boolean esPalindromo(String p){  
      if(p.length()<=1){
        return true;
       }else{
           if(p.charAt(0) == p.charAt(p.length()-1)){
            return esPalindromo(p.substring(1,p.length()-1));
            } 
        }
        return false;
        
    }
}

