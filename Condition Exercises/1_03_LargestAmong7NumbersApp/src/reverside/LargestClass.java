package reverside;

public class LargestClass {
    public static void main(String args[]) {
        
        int[] arr = new int[7];
        arr[0] = 3;
        arr[1] = 7;
        arr[2] = 10;
        arr[3] = 8;
        arr[4] = 15;
        arr[5] = 6;
        arr[6] = 4;
        
        System.out.println(findLargest(arr));
    }
    
    
    public static int findLargest(int[] arr){
        int largest = 0;
        
        for(int x = 0; x<arr.length; x++){
            
            if(largest<arr[x]){
                largest = arr[x];
            }
        }    
       
       return largest;

    }
}