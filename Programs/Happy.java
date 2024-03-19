package yusuf;

import java.util.Scanner;

public class Happy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("Enter one the range");
		int num=scan.nextInt();
		int n=num;
		int sum=0;
		int sq;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+(rem*rem);
			n/=10;
		
			if(n==0&&sum>9) {
				n=sum;
				sum=0;
			}
		}
			if(sum==1) System.out.println("Its a happy number");
			else
				System.out.println("Its not a happy number");
		}
	}


