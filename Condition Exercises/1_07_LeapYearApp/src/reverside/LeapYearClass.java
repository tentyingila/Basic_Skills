package reverside;

public class LeapYearClass {
    public static void main(String args[]) {
        
        System.out.println("If is a leap year results true else false: " + isLeapYear(2018));
        System.out.println("If is a leap year results true else false: " + isLeapYear(2012));
        
    }
    
    public static boolean isLeapYear(int year){
        if(year%4==0&&year!=100){
            return true;
        }
        return false;
    } 
}