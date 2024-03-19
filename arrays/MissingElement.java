package arrays;

public class MissingElement {

	public static void main(String[] args) {
		int []a= {1,2,3,4,2};
		for(int i=a[0];i<a[a.length-1];i++) {
			if(index(a, i)==-1)
				System.out.println(i);
		}

	}
	public static int index(int a[],int element) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==element) 
				return i;
	}
		return -1;
	}

}
