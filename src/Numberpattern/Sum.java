package Numberpattern;

import java.util.Arrays;

public class Sum {

	public static void main(String[] args) {
		
		int[]a= {5,7,2,3,3,3,5,7,7,4,8,9};
		Arrays.sort(a);//2 3 3 3 5 5 7 7 7
		int sum=0;
		int count=1;
		for(int i=1;i<a.length-1;i++) {
			if(a[i]==a[i-1]||a[i]==a.length-1) {
				count++;
			}
			else if(count>1) {
			sum+=a[i-1];
			count=1;
		}
		}
		System.out.println(sum);
	}

}
