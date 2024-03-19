package yusuf;

import java.util.Scanner;

public class Neon {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		 System.out.println("Enter one the range");
		int num=scan.nextInt();
		int n=num;
		int sq=n*n; System.out.println(sq);
		int sum=0;
		while(sq>0) {
			int rem=sq%10;
		sum+=rem;
		sq/=10;
		}
		if(num==sum) System.out.println("It's a neon number");
		else
			System.out.println("It's not a neon number");
	}
}
