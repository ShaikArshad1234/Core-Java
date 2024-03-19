package yusuf;

public class Num1 {
	public static void main(String[] args) {
		
		int n=5;
	    for(int i=1,k=i;i<=n;i++,k--)
	    		 {
	    	int p=k;
	   
	    	for(int j=1;j<=i-1;j++) {
	    		System.out.print(" "+" ");
	    	}
	    	for(int j=i;j<=n;j++) {
	    		System.out.print(p--+" ");
	    	}
	    	System.out.println();
	    	
	    	
	    }
		
	}

}
