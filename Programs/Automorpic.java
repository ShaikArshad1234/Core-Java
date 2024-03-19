package yusuf;

public class Automorpic {

	public static void main(String[] args) {
		int num=56;
		int n=num;
		int sq=n*n;
		int i=1;
		while(n>0)
		{
			i*=10;
			n/=10;
		}
		System.out.println(i);
		if(num==(sq%i))
			System.out.println("its is a automarpic num");
		else
			System.out.println("its is a not automarpic num");
			

	}

}
