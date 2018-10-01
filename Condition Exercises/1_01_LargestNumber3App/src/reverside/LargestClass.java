package reverside;

public class LargestClass {
    public static void main(String args[]) {
        
        int[] arr = new int[]{3,7,10,8,15,6};
        
        System.out.println(findSecondLargest(arr));

        
    }
    
    public static int findSecondLargest(int[] arr){
        int largest = arr[1];
        int secondLargest = arr[0];
        
        if(secondLargest>largest){
            largest = arr[0];
            secondLargest = arr[1];
        }
        
        for(int x = 2; x < arr.length; x++ ){
            if(largest<arr[x]){
                secondLargest = largest;
                largest =arr[x];
            }else if(secondLargest<arr[x] && secondLargest != largest){
                secondLargest = arr[x];
            }
        }
        
        
       
       return secondLargest;
        
    }
}
