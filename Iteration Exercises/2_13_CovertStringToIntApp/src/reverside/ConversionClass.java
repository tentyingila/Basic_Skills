package reverside;

public class ConversionClass {
    
    public static void main(String[] args) { 
            
        convertToInt("1234");

    }
    
     public static void convertToInt(String str)  
        {  
           int convertedInt = 0;
           for(int x = 0; x < str.length(); x++){
                switch(str.charAt(x)){
                case '1':
                   convertedInt = 1;
                   break;
                case '2':
                   convertedInt = 2;
                   break;
                case '3':
                   convertedInt = 3;
                   break;
                case '4':
                   convertedInt = 4;
                   break;
                case '5':
                   convertedInt = 5;
                   break;
                case '6':
                   convertedInt = 6;
                   break;
                case '7':
                   convertedInt = 7;
                   break;
                case '8':
                   convertedInt = 8;
                   break; 
                case '9':
                   convertedInt = 9;
                   break;
                case '0':
                   convertedInt = 0;
                   break;
                }
                
                System.out.print(convertedInt); 
           }
           
        }  
      
    }