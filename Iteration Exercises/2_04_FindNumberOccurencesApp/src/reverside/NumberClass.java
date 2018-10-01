package reverside;

public class NumberClass {

	public static void main(String[] args) {
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
        
        System.out.println(findNumberoccurences(arr, 7));

	}
	
	public static int findNumberoccurences(int[] arr, int n) {
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]==n) {
				count++;
			}
		}
		
		return count;
	}

}
