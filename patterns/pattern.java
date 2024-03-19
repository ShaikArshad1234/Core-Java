package patterns;

class pattern {

	public static void main(String[] args) {
		int p=111;
		int n=3;
		for (int i=1;i<=n;i++)
		{ 
			for (int j=n;j>=1;j--) {
				System.out.print(j*p+" ");
		}
		p/=10;
			
		System.out.println();
	}
	}
}
