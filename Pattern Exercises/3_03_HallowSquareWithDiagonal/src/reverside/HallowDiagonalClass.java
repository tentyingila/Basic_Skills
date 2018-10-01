package reverside;

public class HallowDiagonalClass {

	public static void main(String[] args) {
		drawHallowSquare(5);
	}
	
	
	public static void drawHallowSquare(int n) {
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i==1 || i == n || j == 1 || j == n || i==j || j==(n - i + 1)) {
					System.out.print("x");
				}else {
					System.out.print(" ");
				}
				
			}
			
			System.out.print("\n");
		}
	}

}
