package patterns;
import java.util.Scanner;

class Hallow_pattern {
	public static void main(String[] args) {
    		//System.out.println("Enter the number");
    	//	Scanner scn= new Scanner(System.in)
		//int n=scn.nextInt();
		int n=7;
    for (int i=1;i<=n;i++)
    {
    	for(int j=1;j<=n;j++) {
    		if(i-j==n/2||j-i==n/2||i+j==n/2+2||i+j==n/2+8) {
    			
    		System.out.print("*");
  
    	
    }
    else { 
    	System.out.print(" ");
    }
    	}
    		
    System.out.println();
    }
	}}
