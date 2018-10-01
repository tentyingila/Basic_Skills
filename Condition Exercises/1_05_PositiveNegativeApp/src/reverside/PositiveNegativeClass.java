package reverside;

public class PositiveNegativeClass {
    public static void main(String args[]) {
        
        System.out.println(checkNumber(-5));
        System.out.println(checkNumber(5));
        System.out.println(checkNumber(0));

        
    }
    
    public static String checkNumber(int a){
        String num="";
        if(a<0){
            num = "Negative";
        }else if(a==0){
            num="Zero";
        }else{
            num="Positive";
        }
        
        return num;
    }
    
}
