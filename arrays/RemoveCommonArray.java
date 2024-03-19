package arrays;

public class RemoveCommonArray {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6};
		int []b= {7,8,5,6,9,3,8};
		int c=0;int h=0;
		c=(a.length< b.length)?a.length:b.length;
		
		
		for(int i=0;i<c;i++) {
			h=(a[i]==b[i])?a[i]:b[i];
			  
			System.out.println(h);
			}
	}

}
