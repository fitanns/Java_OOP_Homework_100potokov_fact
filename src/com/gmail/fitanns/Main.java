package com.gmail.fitanns;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {

		MyThreads[] threadsArray = new MyThreads[100];
		for (int i = 0; i < threadsArray.length; i++) {
			threadsArray[i] = new MyThreads(new BigInteger("" + i));
			threadsArray[i].start();
		}

		// ArrayList<MyThreads> threads = new ArrayList<MyThreads>();
//		for (int i = 0; i < 100; i++) {
//			MyThreads c = new MyThreads();
//			c.start();
//			threads.add(c);
//
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//			for (MyThreads d : threads) {
//
//				d.interrupt();
//			}
//
//		}

	}
}
