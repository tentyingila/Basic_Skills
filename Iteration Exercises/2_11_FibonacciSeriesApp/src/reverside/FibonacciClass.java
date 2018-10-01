package reverside;

public class FibonacciClass {
    
    public static void main(String[] args) { 
        
        findFibonacciSeries(10);

    }
    
     public static void findFibonacciSeries(int n)  
        {  
            int n3 = 0;
            int n2 = 1;
            int n1 = 0;
            for(int i=1; i<n; i++){
                n3 = n2 + n1;
                System.out.println(n3);
                n1 = n2;
                n2 = n3; 
            }
            
           
        }  
      
    }