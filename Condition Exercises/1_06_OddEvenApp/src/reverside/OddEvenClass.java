package reverside;

public class OddEvenClass {
    public static void main(String args[]) {
        
        System.out.println(checkOddEven(16));
        System.out.println(checkOddEven(5));
        
    }
    
    public static String checkOddEven(int a){
        String num="";
        if(a%2==0){
            num= "Even";
        }else{
            num="Odd";
        }
        return num;
    } 
}