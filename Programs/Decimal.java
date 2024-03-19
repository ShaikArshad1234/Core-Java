package yusuf;

import java.util.Scanner;

public class Decimal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("Enter one the range");
		int n=scan.nextInt();
	   int i=1;
	   int bin=0;
	   while(n>0) {
		   int rem = n%2;
		   bin=bin+(rem*i);
		   n/=2;
		   i*=10;
	   }
     System.out.println(bin);
	}

	
}




