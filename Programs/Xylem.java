package yusuf;

public class Xylem {

	public static void main(String[] args) {
		int num=8585;
		int n=num;
		int esum=0,sum=0;
		while(n>0) {
			int d=n%10;
			if(n==num||n<10)
				esum+=d;

		else
			sum+=d;
	n/=10;
		}

	if(esum==sum) System.out.println("yes");
	else System.out.println("no");
	}
}
