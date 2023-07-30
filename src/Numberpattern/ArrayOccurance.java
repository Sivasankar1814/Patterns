package Numberpattern;

import java.util.Arrays;

public class ArrayOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {-1,3,2,4,6,-1,6,7};
		Arrays.sort(a);
		frquence(a);
//		for(int i=0;i<a.length;i++) {
//			int count=1;
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]==a[j]) {
//					count++;
//					a[j]=0;
//					
//				}
//			}
//			if(a[i]!=0) {
//			System.out.println(a[i]+"="+count);
//			count=1;
//			}
//		}
//  
	}
	public static void frquence(int []a) {
		int freq=1;
		int i=1;
		while(i<a.length) {
			while(i<a.length&&a[i]==a[i-1]) {
				freq++;
				i++;
			}
			System.out.println(a[i-1]+" "+freq);
			freq=1;
			i++;
			}
		if(a.length==1 || a[i-1]!=a[i-2]) {
			System.out.println(a[i-1]+" "+freq);
			
		}
	}
}
