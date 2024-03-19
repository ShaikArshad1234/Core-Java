package arrays;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
	int a[]= {2,3,4,1};
	int b[]= {2,3,5,6,7,8,9};
	for(int i=0;i<a.length;i++) {
		b[i]=a[i]+b[i];
		}
     System.out.println(Arrays.toString(b));
	}
}

