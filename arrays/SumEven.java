package arrays;

import java.util.Arrays;

public class SumEven {

	public static void main(String[] args) {
      int a[]={231,345,654,986,2,1,987};
           int sum=0;
    	  for(int i=0;i<a.length;i++) {
    		   int n=a[i];
    		  
    		while(n>0)  {
    			
    			int rem=n%10;
    			if(rem%2==0)
    			sum=sum+rem;
    			n/=10;
    			
    		}
    		System.out.println(sum);

    		
    			
    		
    		
    		sum=0;
    			
    	  
    		  
    	  
    	      	  } 
    	  }
    	  
	}


