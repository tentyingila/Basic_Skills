package reverside;

public class WordsClass {
    
    public static void main(String[] args) {  
          String sentence ="I love hello world";
         System.out.println(findNumberWords(sentence));
    }
    
      static int findNumberWords(String sentence)  
        {  
          int count=0;  
      
            char[] ch= new char[sentence.length()];     
            for(int i=0;i<sentence.length();i++)  
            {  
                ch[i]= sentence.charAt(i);  
                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' '))  || ((ch[0]!=' ')&&(i==0)) )  
                    count++;  
            }  
            return count;  
        }  
   
      
}