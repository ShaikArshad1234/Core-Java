package arrays;

public class Minimum {

	public static void main(String[] args) {
        int a[]= {1,2,1,3,2,4,3,4,5,1};
      int min=a.length;
     for(int i=0;i<a.length-1;i++) {
        	 int count=1;
        	for(int j=i+1;j<a.length;j++) {
        		if(a[i]==a[j]) {
        			count++;
        		a[j]=' ';
        		}}
        	if(a[i]!=' ')
        	System.out.println(a[i]+"="+count);
        
        if(count<min) {
        	min=count;
        	int b=a[i];
        }
     }
        System.out.print(" Maximum value="+min);
     
	}
        
	}


