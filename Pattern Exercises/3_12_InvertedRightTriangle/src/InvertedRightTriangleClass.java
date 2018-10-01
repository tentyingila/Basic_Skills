
public class InvertedRightTriangleClass {
	public static void main(String[] args) {
		drawInvertedTriangle(5);
	}

	private static void drawInvertedTriangle(int n) {
	    for(int i=1; i<=n; i++)
	    {
	        /* Iterate through columns */
	        for(int j=i; j<=n; j++)
	        {
	            System.out.print("*");
	        }
	       
	        /* Move to the next line */
	        System.out.print("\n");
	    }
		
	}
}
