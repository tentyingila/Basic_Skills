package reverside;

public class Pyramid {

	public static void main(String[] args) {
		printTriangle(5);
	}
	
    public static void printTriangle(int n) 
    { 
        // number of spaces 
        int k = 2*n - 2; 
   
        // outer loop to handle number of rows 
        //  n in this case 
        for (int i=0; i<n; i++) 
        { 
  
            // inner loop to handle number spaces 
            // values changing acc. to requirement 
            for (int j=0; j<k; j++) 
            { 
                // printing spaces 
                System.out.print(" "); 
            } 
   
            // decrementing k after each loop 
            k = k - 1; 
            for (int j=0; j<=i; j++ ) 
            { 
                System.out.print("* "); 
            } 
   
           
            System.out.println(); 
        }
    }
}
