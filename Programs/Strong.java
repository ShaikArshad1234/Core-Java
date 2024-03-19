package yusuf;

public class Strong {
	public static void main(String[] args) {
		int num=145,n=num;
		
		int sum=0; 
		while(n>0)
		{
			int rem=n%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact*=i;
			
		}
			sum+=fact;
			n/=10;
		
		
		}
		if(sum==num) System.out.println("It is a strong");
		else
			System.out.println("It  not a strong");
		
		
	}

}
