package reverside;

public class MirroredRightTriangleClass {

	public static void main(String[] args) {
		drawMirroredRightTriangle(5);

	}

	private static void drawMirroredRightTriangle(int n) {
		  for(int i=1; i<=n; i++)
		    {
		        /* Print spaces in decreasing order of row */
		        for(int j=i; j<n; j++)
		        {
		            System.out.print(" ");
		        }

		        /* Print star in increasing order or row */
		        for(int j=1; j<=i; j++)
		        {
		            System.out.print("*");
		        }

		        /* Move to next line */
		        System.out.print("\n");
		    }
		
	}
	

}
