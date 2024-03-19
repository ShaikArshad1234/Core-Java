package arrays;

import java.util.Scanner;

public class LineaarSearch {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int key=9;
		System.out.println(isLinear(a,key));
		
}
	public static int isLinear(int[] a,int key) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==key)
				return i;
			
		}
		return-1;
		
	}
	
}	
	
