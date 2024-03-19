package yusuf;
import java.util.Scanner;

public class FibonacciSeries2 {
	public static void main(String[] args) {
		int a=0,b=1,c;
		Scanner scan=new Scanner(System.in);
				System.out.println("Enter the minimum value");
		int m=scan.nextInt();
		System.out.println("Enter the maximum value");
		int n=scan.nextInt();
		while(a<=n) {
			if(a>=m) System.out.println(a); 
				c=a+b;
				a=b;
				b=c;
			
		}
	}

}
