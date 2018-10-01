package reverside;

public class RightTriangle {

	public static void main(String[] args) {
		drawRightTriangle(5);

	}
	
	public static void drawRightTriangle(int n) {
		//For Rows
		for(int i = 1; i <=n; i++) {
			//For Columns
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}

}