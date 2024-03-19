package yusuf;

class Perfect {
	public static void main(String[] args) {
		int num=6;
		int n=num;
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0)
				sum+=i;
	}
	if(sum==num) System.out.println("It's a perfect");
	else
		System.out.println("It's not a perfect");

}
	
}
