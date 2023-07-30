package Numberpattern;

public class Test1 {
public static void main(String[] args) {
	System.out.println("main thread"+"    "+Thread.currentThread().getName());
	HelloWorldPrinting ht=new HelloWorldPrinting();
	Thread t=new Thread(ht);
	t.start();
}
}
