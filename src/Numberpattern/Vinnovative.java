package Numberpattern;

import java.util.Arrays;

public class Vinnovative {

	public static void main(String[] args) {
		int[]a= {5,7,2,3,3,3,5,7,7,4,8,8};
		Arrays.sort(a);//2 3 3 3 5 5 7 7 7 
		int sum=0;
		for(int i=0;i<a.length-1;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				count++;
				i=j;
			}
			}
			if(count>1) {
				System.out.print(a[i]+" ");
				sum+=a[i];
	   }
		
	}
		System.out.println();
		System.out.println(sum);
     }
}

