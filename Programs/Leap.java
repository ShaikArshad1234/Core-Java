package yusuf;

public class Leap {

	public static void main(String[] args) {
   int year=300;
    if(year%4==0) {
    	System.out.println("It's a leap year");}
    if(year%100==0) {
    	if(year%400==0) {
    		System.out.println("It's a leap year");
    	}
    	else
    		System.out.println("It's  not a leap year");
    }
    else
    	System.out.println("It's not a leap year");

}
}