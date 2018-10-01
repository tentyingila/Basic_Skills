package reverside;

public class OddClass {

	public static void main(String[] args) {
		findOddnumbers(20);
		
	}
	
	public static void findOddnumbers(int n) {
		for(int i = 1; i <= n; i++) {
			if(i%2!=0) {
				System.out.print(i + " ");
			}
		}
	}	

}
