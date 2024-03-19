package yusuf;

import java.util.Scanner;

class Even {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the number");
		int n=scan.nextInt();
		if(n/2*2==n)
			System.out.println("even");
		else
			System.out.println("odd");
	}

}
