package patterns;

public class num24 {

	public static void main(String[] args) {
		int n=3;
		int k=1;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i+1-1;j--) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}

}
