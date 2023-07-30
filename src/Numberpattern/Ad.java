package Numberpattern;

import java.util.Set;
import java.util.TreeSet;

public class Ad {

	public static void main(String[] args) {
int []a= {1,2,12,2,4,6,2,3,1};
   Set<Integer>s=new TreeSet<>();
   for(int i=0;i<a.length;i++) {
	   s.add(a[i]);
   }
   System.out.println(s);
	}

}
