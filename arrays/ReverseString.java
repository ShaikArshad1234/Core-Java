package arrays;

import java.time.chrono.MinguoChronology;
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("\n1.reverse\n2.sum2\n3.Count\n4.Vowels\n5.Second Last element\n6.SquareArray");
		int n=scn.nextInt();
		int size =scn.nextInt();

		switch(n) {
		case 1:{
			char[] a= {'a','b','c','d','e'};
			for(int i=a.length-1;i>=0;i--) {
				 System.out.println(a[i]);
			} 
		}break;
			case 2:{
				int[]a= {1,2,3,4,5,6,7};
				int sum=0;
			 for(int i=0;i<7;i++) {
			sum	= a[i]+sum;
			 }
			 System.out.println(sum);
			}
			break;
			case 3:{
				int count =0;
				int[]a= {12,0,8,9,0,4,8,0,3,0};
				for(int i=0;i<10;i++) {
				if(a[i]==0) count++;
				}
				System.out.println("Zeros="+count);
			}break;
			case 4:{
				int count=0;
				char[]a = {'w','e','r','g','o','i'};
				//str=str.toLowerCase();
				for(int i=0;i<a.length;i++) {
					if(a[i]=='a'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='e')
						
					System.out.print(a[i]);
					
					
				}
				count++;
				System.out.println(count);
						
				
					}break;
				case 5 :{

			int[]a= {12,0,8,9,0,4,8,0,3,0};
			
			System.out.println(a[a.length-2]);

		
				}break;
				case 6:{
							int sq=0;
							int temp=0;
						int a[]= {2,1,2,3,4,7};
						for(int i=0;i<a.length;i++) {
							int d=(int)Math.pow(a[i], 2);
							a[i]=d;
						}
						for(int k:a)System.out.println(k);
						}break;
				
	}
}
		
			
}

		


	
