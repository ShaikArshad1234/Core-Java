package arrays;

import java.util.Arrays;

public class NegPov {

	public static void main(String[] args) {
		int a[]= {0,-1,0,-6,0,-1};
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				a[i]=0;
				 b[i]=a[i];
			}
				else {
				a[i]=-1;
				b[i]=a[i];
				
			}
		}
			System.out.println(Arrays.toString(b));
			
				
			//System.out.print(a[i]+" ");
				
		
	}

}
