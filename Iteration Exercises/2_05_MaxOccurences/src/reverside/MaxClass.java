package reverside;

public class MaxClass {

	public static void main(String args[]) {
        int[] arr = new int[10];
        arr[0] = 8;
        arr[1] = 2;
        arr[2] = 9;
        arr[3] = 7;
        arr[4] = 19;
        arr[5] = 15;
        arr[6] = 13;
        arr[7] = 7;
        arr[8] = 9;
        arr[9] = 7;

        int[] results = findMaxOccurences(arr);
        
        System.out.println("Array value: " + results[0] + " -- Occurences: " + results[1]);
	}
	
	public static int[] findMaxOccurences(int[] arr) {
		int max = 0;
		int value = 0;
		int results[] = new int[2];
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i; j < arr.length; j++) {
				if (arr[i] == arr[j]){
					count++;
				}
			}
			if (count > max){
				max = count;
				value = arr[i];
			}
		}
		
		results[0] = value;
		results[1] = max;
		
		return results;
	}
}
