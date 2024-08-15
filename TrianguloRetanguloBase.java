public class TrianguloRetanguloBase {
    public static void main(String[] args) {
        int base = 5;
        
        for(int i = base; i > 0; i--){
            System.out.println();
            for(int j = base; j > 0; j--){
                System.out.print("*");
            }
            base--;
        }
    }
}
