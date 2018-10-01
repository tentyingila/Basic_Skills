package reverside;


public class Myclass {

	public static void main(String[] args) {
		int arr[] = new int[12];
		arr[0] = 5;
		arr[1] = 8;
		arr[2] = 6;
		arr[3] = 4;
		arr[4] = 9;
		arr[6] = 8;
		arr[7] = 5;
		arr[8] = 84;
		arr[9] = 54;
		arr[10] = 5;
		arr[11] = 78;
		
		findMaxConsecutiveDifference(arr);
	}
	
	public static void findMaxConsecutiveDifference(int[] arr) {
		int maxDiff = 0;
		int min  = arr[0];
		int max = arr[1];;
		
		if(min > max) {
			max = arr[0];
			min = arr[1];
		}
		
		maxDiff = max - min;
		
		for(int i = 2; i < arr.length; i++) {
				if(arr[i]< arr[i-1]) {
					min = arr[i];
					max = arr[i-1];
					if(maxDiff<(max-min)) {
						maxDiff = max-min;
					}
				}else if(arr[i]>arr[i-1]) {
					min = arr[i-1];
					max = arr[i];
					if(maxDiff<(max-min)) {
						maxDiff = max - min;
					}
				}
		}
		
		System.out.println(maxDiff);
		
	}

}
