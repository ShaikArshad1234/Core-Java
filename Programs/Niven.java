package yusuf;

public class Niven {
	public static void main(String[] args) {
		int num=12;
		int n=num;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum+=rem;
			n/=10;
		}
		if(num%sum==0) System.out.println("It's a niven number");
		else
			System.out.println("It's not a niven number");

	}

}
