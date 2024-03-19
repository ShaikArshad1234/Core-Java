package patterns;

import java.util.Scanner;

public class Numdig {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scn.nextInt();
		int p=1;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				for(int j=1;j<=n;j++) {
					System.out.print(p+" ");
					p++;
				
			}}
			else {
				char ch='A';
				for(int j=1;j<=n;j++) {
					System.out.print(ch+++"  ");
					
					
				}
			}
			
					
					
			
		System.out.println();
				
		}
	}
	}


