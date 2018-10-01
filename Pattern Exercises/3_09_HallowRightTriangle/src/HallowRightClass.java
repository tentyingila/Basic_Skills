
public class HallowRightClass {

	public static void main(String[] args) {
		drawHallowRightTriangle(5);

	}

	private static void drawHallowRightTriangle(int n) {
	    for(int i=1; i<=n; i++)
	    {
	        for(int j=1; j<=i; j++)
	        { 
	            if(j==1 || j==i || i==n)
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
