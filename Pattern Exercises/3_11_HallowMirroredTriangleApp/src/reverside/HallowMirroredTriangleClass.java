package reverside;

public class HallowMirroredTriangleClass {
	
	public static void main(String[] args) {
		drawHallowMirroredTriangle(5);
	}

	/**
	 * @param n
	 */
	/**
	 * @param n
	 */
	/**
	 * @param n
	 */
	/**
	 * @param n
	 */
	/**
	 * @param n
	 */
	private static void drawHallowMirroredTriangle(int n) {
	    for(int i=1; i<=n; i++)
	    {
	        /* Print trailing spaces */
	        for(int j=i; j<n; j++)
	        {
	            System.out.print(" ");
	        }

	        /* Print hollow right triangle */
	        for(int j=1; j<=i; j++)
	        {

	            if(i==n || j==1 || j==i)
	            {
	                System.out.print("*");
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }

	        System.out.print("\n");
	    }
		
	}
		
	
}
