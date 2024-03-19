package yusuf;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("Enter one the range");
		int num=scan.nextInt();
		int n=num;
		for(int i=1;i<=10;i++)
			System.out.println(n+"*"+i+"="+n*i);
	}

}
