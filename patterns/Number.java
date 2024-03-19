package patterns;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("Enter one the range");
		int num=scan.nextInt();
		int n=num;
		//int n=3;
		for(int i=n;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print(4);
		}
			System.out.print(" ");
			for(int j=0;j<=i;j++) {
				System.out.print(3);
		}
			System.out.print(" ");
			for(int j=0;j<=i;j++) {
				System.out.print(2);
		}
			System.out.print(" ");
			for(int j=0;j<=i;j++) {
				System.out.print(1);
		}
			System.out.print(" ");
			System.out.println();
		}
	}
	}

