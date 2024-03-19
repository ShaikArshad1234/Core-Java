package patterns;

public class NUm {

	public static void main(String[] args) {
	   int n=3;
	   int flag=0;
		for (int k=1;k<=n;k++)
		{ 
			int ans=n;
			for (int i=n;i>=1;i--) {
				for (int j=1;j<=n-k+1;j++) {
					System.out.print(i);
					flag++;
					if(flag==i) {
						ans--;
				 flag=0;
					}
				//	System.out.print("y");
						
				}
				System.out.print(" ");
				
			}
			System.out.println();
		}
			
	

}
}