package arrays;
public class Occurence {
	public static void main(String[] args) {
		int a[]= {1,2,3,2,3,5,6,7,1};
	
		for(int i=0;i<a.length;i++) {
       	 int count=1;
       	for(int j=i+1;j<a.length;j++) {
       		if(a[i]==a[j]) {
       			count++;
       		a[j]=' ';
       		}
       	}
       	if(a[i]!=' ')
       	System.out.println(a[i]+"="+count);
	}
	}

}
