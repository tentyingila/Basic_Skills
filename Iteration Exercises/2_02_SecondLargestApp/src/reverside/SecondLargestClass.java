package reverside;

public class SecondLargestClass {
    public static void main(String args[]) {
        int[] arr = new int[7];
        arr[0] = 8;
        arr[1] = 2;
        arr[2] = 9;
        arr[3] = 7;
        arr[4] = 19;
        arr[5] = 15;
        arr[6] = 13;
        
        System.out.println(findSecondLargest(arr));
    }
    
    
    public static int findSecondLargest(int[] arr){
        int largest=arr[1];
        int secondLargest=arr[0];
        
        if(secondLargest > largest){
            largest = arr[0];
            secondLargest = arr[1];
        }
        
        for(int x = 0; x<arr.length; x++){
            if(arr[x]>largest){
                secondLargest = largest;
                largest = arr[x];
            }else if(arr[x] > secondLargest && arr[x] != largest){
                secondLargest = arr[x];
            }
        }
        
        return secondLargest;
    }
}