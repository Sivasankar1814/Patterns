package Numberpattern;

public class HelloWorldPrinting implements Runnable 
{
@Override
public void run() {
	System.out.println("Hello world"+""+Thread.currentThread().getName());
	
}
}
