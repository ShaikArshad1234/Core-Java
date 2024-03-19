package yusuf;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("Enter one the range");
		int n=scan.nextInt();
	      int dec=0;
	    		  int i=1;
	    		  while(n>0) {
	    			  int rem=n%10;
	    			  dec=dec+(rem*i);
	    			  i*=2;
	    			  n/=10;
		} 
     System.out.println(dec);
	}

}

