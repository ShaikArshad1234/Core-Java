package patterns;

public class alpha {

	public static void main(String[] args) {
   int alphabet=65;
    for(int i=0;i<=5;i++)
    {
    	for(int j=0;j<=i;j++) {
    		System.out.print((char) (alphabet+j));
    }
      alphabet++;
    System.out.println();
	}}
	 
}
