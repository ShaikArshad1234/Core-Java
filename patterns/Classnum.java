package patterns;

public class Classnum {
  public static void main(String[] args) {
	  int n=5,p=1;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(p);
			p++;
		}
		System.out.println();
	}
}
}
