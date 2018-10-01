package reverside;

public class Pyramid {

	public static void main(String[] args) {
		drawPyramid(5);

	}
	
	public static void drawPyramid(int n) {
	    int spaces = n-1;
	    int star = 1;
	    
	    /* Iterate through rows */
	    for(int i=1; i<n*2; i++)
	    {
	        /* Print leading spaces */
	        for(int j=1; j<=spaces; j++)
	            System.out.print(" ");
	        
	        /* Print stars */
	        for(int j=1; j<=star; j++)
	            System.out.print("*");
	        
	        /* Move to next line */
	        System.out.print("\n");
	        
	        if(i < n) 
	        {
	            star++;
	            spaces--;
	        }
	        else
	        {
	            star--;
	            spaces++;
	        }
	    }
	}
	

}
