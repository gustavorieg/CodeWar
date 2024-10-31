class ExOhs{
    public static void main(String[] args) {

        String str = "ooxXm";
        System.out.println(countXO(str));

    }

    public static Boolean countXO(String str){
        String[] strArr = str.split("");
        
        int x = 0;
        int o = 0;

        for(String l : strArr){
           
            if(l.equals("x") || l.equals("X")){
                x++;
            }
            if(l.equals("o")){
                o++;
            }
        }

        return x == o;
    }
}