package yusuf;

public class Armstrong {

	public static void main(String[] args) {
		int num=153;
		int n=num;
		int sum=0;
		int count =0;
		while(n>0){
			count++;
			n/=10;
		}
		n=num;
	 while(n>0) {
		 int rem=n%10;
		 int p=1;
		 for(int i=1;i<=count;i++)
		 {
			 p*=rem;
		 }
		 sum+=p;
		 n/=10;
		 
	 }
	 if(sum==num) System.out.println("Armstrong");
	 else
		 System.out.println(" Not a Armstrong"); 
	}

}
