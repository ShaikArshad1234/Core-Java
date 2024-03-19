package yusuf;

public class prime {

	public static void main(String[] args) {
		int num=3;
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
		}
		if(count==2)
			System.out.println("Its a prime number");
		else 
			System.out.println("Its not a prime number");
	}

}
