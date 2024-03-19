package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrinmeArray {
	  public static boolean isPrime(int n) {
			int count=0;
			for(int i=1;i<=n;i++) {
				if(n%i==0)
					count++;
			}
				if(count==2)
					return true;
				return false;
		  }
		 public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
				 System.out.println("Enter the size");
				int size=scan.nextInt();
				int a[]=new int[size];
				int b[]= new int[a.length];
				for(int i=0;i<a.length;i++) {
					a[i]=scan.nextInt();
				}
				System.out.println("111111111111111111111111");
					for(int i=0;i<a.length;i++) {
						if(isPrime(a[i])) 
							
				      System.out.println(a[i]);
		}}}
