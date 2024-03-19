package arrays;

public class SecondHighest {

	public static void main(String[] args) {
		int max1=0,max2=0;
		int a[]= {1,4,23,5,67,9};
		for(int i=0;i<a.length;i++) {
			int n=a[i];
			if(n>max1) {
				max2=max1;
				max1=a[i];
			}
			//System.out.println(max1);			
			if(max1!=n&&n>max2) {				
				max2=n;	
			}
		}
			System.out.println(max2);		
	}
}