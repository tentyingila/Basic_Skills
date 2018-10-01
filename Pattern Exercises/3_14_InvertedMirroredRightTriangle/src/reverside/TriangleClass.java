package reverside;

public class TriangleClass {

	public static void main(String[] args) {
		drawTriangle(5);

	}

	private static void drawTriangle(int n) {
	    for(int i=1; i<=n; i++)
	    {
	        /* Print leading spaces */
	        for(int j=1; j<i; j++)
	        {
	            System.out.print(" ");
	        }

	        /* Iterate through columns to print star */
	        for(int j=i; j<=n; j++)
	        {
	            System.out.print("*");
	        }

	        /* Move to next line */
	        System.out.print("\n");
	    }
		
	}

}
