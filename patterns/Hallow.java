package patterns;

public class Hallow {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i-j==n/2-1||j-i==n/2-1||i+j==n/2+1||i+j==n/2+5) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
			System.out.println();

	}

	}}
