package reverside;

public class SecondLargestClass {
    public static void main(String args[]) {
        
        System.out.println(findLargest(3,7,2));

        
    }
    
    public static int findLargest(int a, int b, int c){
        int largest=0;
        if(largest<a){
            largest = a;
        }
        if(largest<b){
            largest = b;
        }
        if(largest<c){
            largest = c;
        }
        
        return largest;
        
    }
}