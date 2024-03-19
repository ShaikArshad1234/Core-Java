package yusuf;

class Spy {
	public static void main(String[] args) {
		int num=5;
		int n=num;
		int sum=0;
		int proud=1;
		while(n>0)
		{
			int rem=n%10;
			sum+=rem;
			proud*=rem;
			n/=10;
		}
		if(sum==proud)
			System.out.println("It's a spy number");
		else
			System.out.println("It's not a spy number");
	if (sum+proud==num)
		System.out.println("It's a special number");
	else
		System.out.println("It's not a special number");
}
}
