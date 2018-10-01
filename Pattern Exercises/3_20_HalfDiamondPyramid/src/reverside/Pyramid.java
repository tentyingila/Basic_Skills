package reverside;

public class Pyramid {

	public static void main(String[] args) {
		drawPyramid(5);

	}
	
	public static void drawPyramid(int n) {
	    int columns=1;

	    for(int i=1;i<n*2;i++)
	    {
	        for(int j=1; j<=columns; j++)
	        {
	            System.out.print("*");
	        }

	        if(i < n)
	        {
	            /* Increment number of columns per row for upper part */
	            columns++;
	        }
	        else
	        {
	            /* Decrement number of columns per row for lower part */
	            columns--;
	        }

	        /* Move to next line */
	        System.out.print("\n");
	    }
	}

}
