package arrays;

public class SqureArray {

	public static void main(String[] args) {
		int sq=0;
		int temp=0;
	int a[]= {2,1,2,3,4,7};
	for(int i=0;i<a.length;i++) {
		int d=(int)Math.pow(a[i], 2);
		a[i]=d;
	}
	for(int k:a)System.out.println(k);
		

	}

}
