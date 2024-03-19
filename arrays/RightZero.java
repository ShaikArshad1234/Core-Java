package arrays;

import java.util.Arrays;

public class RightZero {

	public static void main(String[] args) {
		int a[]= {1,2,0,2,0,4};
		int k=0;
		int d[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
				if(a[i]!=0) {
					d[k]=a[i];
					k++;
}
		}	
        System.out.println(Arrays.toString(d));
}}