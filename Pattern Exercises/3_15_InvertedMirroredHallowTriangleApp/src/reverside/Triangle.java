package reverside;

public class Triangle {
		public static void main(String[] args) {
			drawTriangle(5);
		}

		private static void drawTriangle(int n) {
		    for(int i=1; i<=n; i++)
		    {
		        /* Iterate through columns */
		        for(int j=i; j<=n; j++)
		        {
		            /* 
		             * Print stars for first row(i==1), 
		             * first column(j==1) and 
		             * last column(j=rows).
		             */
		            if(i==1 || j==i || j==n)
		            {
		                System.out.print("*");
		            }
		            else
		            {
		                System.out.print(" ");
		            }
		        }

		        /* Move to next line */
		        System.out.print("\n");
		    }

			
		}
		
		
}
