package arrays;

import java.util.Arrays;

public class LiftZeroes {

	public static void main(String[] args) {
		int a[]= {1,2,0,2,3,4,5,0,0,0,0,4};
		int k=a.length-1;
		int d[]=new int[a.length];
		for(int i=a.length-1;i>=0;i--) {
			
				if(a[i]!=0) {
				d[k]=a[i];
				k--;
		}
				
		}
				System.out.println(Arrays.toString(d));
		
	
	}}

