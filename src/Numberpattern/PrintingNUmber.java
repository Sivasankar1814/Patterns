package Numberpattern;

public class PrintingNUmber implements Runnable {
	private int number;
	public PrintingNUmber(int number) {
		this.number=number;
	}
	
@Override
public void run() {
	Thread.currentThread().setName("ben10 panipuri");
	System.out.println(number+" "+Thread.currentThread().getName());
}
}
