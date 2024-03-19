package yusuf;

public class FibonacciSeries {
	public static void main(String[] args) {
			int a=0,b=1,c=0;
			int n=5;
			System.out.println(a+ " "+b);
			for(int i=3;i<=n;i++) {
				//System.out.println(a+" ");
				c=a+b;
				//System.out.println(a+ " "+b);

				System.out.println(c);
				a=b;
				b=c;
			}
		
	}

}
