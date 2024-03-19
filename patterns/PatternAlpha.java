package patterns;

import java.util.Scanner;

public class PatternAlpha {

	public static void main(String[] args) {
     for(int i=5;i>=1;i--) {
    	 for(int j=i;j>=1;j--) {
    		System.out.print(j);
    		 if(j==5||j==4||j==3||j==2)
    		 {
    			 System.out.print(" * ");
    		 //System.out.print(j);
    		 }
    		 else
    			 System.out.print("   ");
    	 }
    	 System.out.println();
     }
     
    	 
	}

}
