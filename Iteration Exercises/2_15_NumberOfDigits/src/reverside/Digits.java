package reverside;

public class Digits {

	public static void main(String[] args) {
		findNumberOFDigits(76548);

	}
	
	public static void findNumberOFDigits(int num) {
		int count = 0;
		while(num!=0){
			num = num /10;
			++count;
		}
		
		System.out.println(count);
		
	}

}
