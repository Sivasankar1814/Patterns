package Numberpattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test2 {
	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(10);
		for(int i=1;i<=100;i++) {
			PrintingNUmber nu=new PrintingNUmber(i);
			Thread t=new Thread(nu);
			//nu.run();
			t.start();
			if(i==30) {
				System.out.println("exict");
			}
			//System.out.println(Thread.currentThread().getName());
		}
	}
}
