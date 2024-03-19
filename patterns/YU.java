package patterns;

public class YU {

	public static void main(String[] args) {
		int n=9;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=9;j++) {
				if(i+j==n+1||i==j||j==1||j==n)
					System.out.print(i);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
				