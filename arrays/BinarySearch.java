package arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int key=9;
			int a[]= {1,2,3,4,5,6,7,8,9};
		System.out.println(search(a, key));
	}



		public static int search(int a[],int key) {
			int st=0;
			int end=a.length-1;
			while(st<=end) {
				int mid=((st+end)/2);
				if(key==a[mid])return mid;
				else if(key<a.length) 
					end=mid-1;
					else
						st=mid+1;
					
				}
			return -1;
			}
		}
