package reverside;

public class LargestClass {
    public static void main(String args[]) {
        int[] arr = new int[7];
        arr[0] = 8;
        arr[1] = 2;
        arr[2] = 9;
        arr[3] = 7;
        arr[4] = 19;
        arr[5] = 15;
        arr[6] = 13;
        
        System.out.println(findLargest(arr));
    }
    
    
    public static int findLargest(int[] arr){
        int largest=0;
        
        for(int x = 0; x<arr.length; x++){
            if(arr[x]>largest){
                largest = arr[x];
            }
        }
        
        return largest;
    }
}