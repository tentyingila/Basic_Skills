package reverside;

public class FizzBuzzApp {
    public static void main(String args[]) {
        
       fizzBuzz(35);
    }
    
    
    public static void fizzBuzz(int n){
        
        for(int x = 1; x<=n; x++){
            if(x%3==0&&x%5==0){
                System.out.println("FIZZBUZZ");
            }else if(x%3==0){
                System.out.println("FIZZ");
            }else if(x%5==0){
                System.out.println("BUZZ");
            }else{
                System.out.println(x);
            }
        }

    }
}