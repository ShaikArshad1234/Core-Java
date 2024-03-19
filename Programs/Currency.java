package yusuf;

import java.util.Scanner;

public class Currency {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("Enter one the range");
		int num=scan.nextInt();
		int a=num;
		if(a>=2000) {
			System.out.println("2000 *"+(a/2000));
		 a=a%2000;
		}
		
		if(a>=1000) {
			System.out.println("1000 *"+(a/1000));
		 a=a%1000;
		}
		if(a>=500) {
			System.out.println("500 *"+(a/500));
		 a=a%500;
		}
		if(a>=200) {
			System.out.println("200 *"+(a/200));
		 a=a%200;
		}
		if(a>=100) {
			System.out.println("100 *"+(a/100));
		 a=a%100;
		}
		if(a>=50) {
			System.out.println("50 *"+(a/50));
		 a=a%50;
		}




	}

}
