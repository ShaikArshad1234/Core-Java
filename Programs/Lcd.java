package yusuf;

public class Lcd {

	public static void main(String[] args) {
			int a=30;
			int b=20;
			int n=a>b?a:b;
			for(int i=1;i<=n;i++) {
				if(n%a==0&&n%b==0)break;
				  n++;
			}
			System.out.println(n);
	}

}
