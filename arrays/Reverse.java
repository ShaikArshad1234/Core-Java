package arrays;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		int a[]= {23,54,57,93,111,1};
		int i=0;
			a[i]=rev(a[i]);
			i++;
	
		System.out.println(Arrays.toString(a));
		}


	
	
	static int ans=0;
	public static int rev(int n) {
		if(n==0)return ans;
		ans=ans*10+n%10;
		rev(n/=10);
		return ans;
		
	}

	}
