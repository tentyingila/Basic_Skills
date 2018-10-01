package reverside;

public class ReverseClass {

	public static void main(String[] args) {
		System.out.println(reverseNumber(1234));

	}
	
	public static int reverseNumber(int num) {
		int result = 0;
		int remainder = 0;
		while(num!=0) {
			remainder = num%10;
			result = result * 10 + remainder;
			num = num/10;
		}
		
		return result;
		
	}

}
