package yusuf;

import java.util.Scanner;

public class Leap_year {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the year");
	int year=scan.nextInt();
	if(year%4==0&&year%100!=0||year%400==0) {
		System.out.println("It's a leap year");
	}
	else
		System.out.println("It's not a leap year");
}
}
