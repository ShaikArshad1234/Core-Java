package arrays;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {			
			int a[]= {1,2,3,3,2,1,1,2,3,4};
			for(int i=0;i<a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						a[j]=0;
	}
			}
			
				if(a[i]!=0)
				System.out.println(a[i]);
			
	
}}
}