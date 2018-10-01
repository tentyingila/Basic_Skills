package reverside;

class Pyramid
{
    public static void main(String[] args)
    {
    	drawPyramid(5);
    }
    
    public static void drawPyramid(int n) {

        // Do for each row
        for (int i = n; i >= 1; i--)
        {
            // Print space
            for (int j = n; j > i; j--) {
                System.out.print(' ');
            }

            // Print '*'
            for (int k = 1; k < 2*i; k++) {
                System.out.print('*');
            }

            // Move to the next line
            System.out.print(System.lineSeparator());
        }
    }
}


