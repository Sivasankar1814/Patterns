package Numberpattern;

public class Demo2 {
public static void main(String[] args) {
	int x=6;
	int y=5;

	while(y!=0) {
		int a=x&y;
		x=x^y;
		y=a<<1;
	}
	
	System.out.println(x
		
			
			
		
			
			);
	System.out.println(Integer.sum(x, y));
	System.out.println(add(5,6));
	
	
}
public static int add(int a,int b) {
	return Integer.sum(a, b);
}
}
