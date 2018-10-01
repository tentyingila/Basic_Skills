package reverside;

public class SwapClass {
    public static void main(String args[]) {
        int num = 1234;
        System.out.println(findSwapFirstLast(num));
    }
    
    public static int findSwapFirstLast(int num){
        
       int arrCount = 0;
       int num1 = num;
       
       //count number of digits so array length can be defined
       while(num1!=0){
           num1 = num1/10;
           arrCount++;
       }
       
       int[] arr = new int[arrCount];
       int count = 0;
       
       for(int i = 0; i < arr.length; i++){
           arr[i] = num%10;
           num = num/10;
       }
       
       
       num = arr[0];
       // add middle numbers of array to the first array number of the array 
       for(int j = arr.length-2; j>0; j--){
           num = num *10 + arr[j];
       }
       
       //add last array number
       num = num * 10 +arr[arr.length -1];
       return num;
    }
}