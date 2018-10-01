package reverside;

public class Square {
	
	public static void main(String args[]) {
		printSquareStarPattern(5);
	}
	
	public static void printSquareStarPattern(int n) {
		for(int i = 0; i < n; i++) {
			//iterate columns
			for(int j = 0; j < n; j++) {
				System.out.print("x");
			}
			System.out.print("\n");
		}
	}

}
