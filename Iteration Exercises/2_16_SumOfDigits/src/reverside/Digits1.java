package reverside;

public class Digits1 {

	public static void main(String[] args) {
		findSumOfDigits(1234);

	}
	
	public static void findSumOfDigits(int num) {
		int sum = 0; 
		int add =0;
		while(num!=0) {
			add = num%10;
			sum = sum + add;
			num = num/10;
		}
		
		System.out.println(sum);
	}

}
