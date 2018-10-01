package reverside;

public class SortArrayClass {
    
    public static void main(String[] args) { 
        int[] arr = new int[7];
        arr[0] = 8;
        arr[1] = 2;
        arr[2] = 9;
        arr[3] = 7;
        arr[4] = 19;
        arr[5] = 15;
        arr[6] = 13;
        
        int[] sortedArray = sortArray(arr);
        for(int i =0; i < arr.length; i++){
            System.out.println(sortedArray[i]);
        }
    }
    
     public static int[] sortArray(int[] arr)  
        {  
            int temp;
            for(int i =0; i < arr.length; i++){
                for(int j = i; j < arr.length; j++){
                    if(arr[i] > arr[j]){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
           return arr; 
  
    }  
      
}