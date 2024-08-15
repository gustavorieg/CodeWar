

/**
 *
 * @author Gustavo Rieg
 */
public class BreakCamelCase {
    public static void main(String[] args) {
        String exemplo1 = camelCase("camelString");
        System.out.println(exemplo1);
    }  

    public static String camelCase(String input){
        
        String palavra = "";
        String[] letras = input.split("");
        for(String l : letras){
            Boolean x = letraMaiuscula(l);
            if(x){
                palavra = palavra + " " + l;
                continue;
            } 
            palavra = palavra + l;
        }

        return palavra;
    }

    public static Boolean letraMaiuscula(String letra){
        String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", 
                           "J", "K", "L", "M", "N", "O", "P", "Q", "R",
                           "S", "T", "U", "V", "W", "X", "Y", "Z"};

        for(String l : letras){
            if(letra.equals(l)){
                return true;
            }
        }
        return false;
    }
}
