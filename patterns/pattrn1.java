package patterns;

public class pattrn1 {
public static void main(String[] args) {
	int n=7;
	for (int i=1;i<=n;i++) {
		for(int k=1;k<=n;k++) {
if(i==k||i+k==n+1) {
	System.out.print("   ");
}
else {
	System.out.print(" * ");
}
		}
		System.out.println();
	}
}
}
