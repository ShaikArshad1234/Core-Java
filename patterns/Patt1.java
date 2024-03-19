package patterns;
import java.util.Scanner;

public class Patt1 {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the number greater than 1");
		int n=scn.nextInt();
		int p=2;
		for(int i=1;i<=p;i++) {
			for(int j=1;j<=n-1;j++) {
				if(j==1||i==p)
				System.out.print("*");
			
			else
				System.out.print(" ");
			
		}
			System.out.println();
		
		}}}
	