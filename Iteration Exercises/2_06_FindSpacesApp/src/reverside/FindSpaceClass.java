package reverside;

public class FindSpaceClass {
    public static void main(String args[]) {
        String sentence = "This is hello world";
        System.out.println(findSpaces(sentence));
    }
    
    
    public static int findSpaces(String sentence){
        int count=0;
        for(int x = 0; x<sentence.length(); x++){
            if(sentence.charAt(x)==' '){
                count++;
            }
        }
        
        return count;

    }
}
