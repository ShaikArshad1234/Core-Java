package patterns;

public class Num1 {

	public static void main(String[] args) {
		 int n=3;
		   int flag=0;
			for (int k=0;k<=1;k++)
			{ 
				int ans=n;
				for (int i=n;i>=0;i--) {
					for (int j=0;j<=n-k;j++) {
						System.out.print(i);
						flag++;
						if(flag==i) {
							ans--;
					 flag=0;
						}
						System.out.print("y");
							
					}
					System.out.print(" $ ");
					
				}
			}
			
				
		

	}
	}


