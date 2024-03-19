package arrays;

public class CommonTwoArrays {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8,};
		int []b= {1,2,3,4,5,6,0,1,2,3,7,8};
		int c=0;int h=0;
		c=(a.length<=b.length)?a.length:b.length;
		
		
		for(int i=0;i<c;i++) {
			for( int j=0;j<c;j++) {

			if(a[i]==b[j])
				j++;
			

			
			}
			System.out.println(a[i]);
			
}
}}