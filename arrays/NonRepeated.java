package arrays;

import java.util.Arrays;

public class NonRepeated {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,3,2,1,-1,6,0};
			for(int i=0;i<a.length;i++) {
				int count=0;
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) count++;
				}
				
					
			
			
	
			if(count!=1)
			System.out.print(a[i]+" ");
}}
}