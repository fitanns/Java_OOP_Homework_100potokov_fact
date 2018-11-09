package com.gmail.fitanns;

import java.math.BigInteger;

public class MyThreads extends Thread {

	private BigInteger n;

	public MyThreads(BigInteger n) {
		super();
		this.n = n;
	}

	public MyThreads() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BigInteger getN() {
		return n;
	}

	public void setN(BigInteger n) {
		this.n = n;
	}

	@Override
	public void run() {

		BigInteger res = fact(n);
		System.out.println(getId() + ": " + res);

	}

	private BigInteger fact(BigInteger x) {
		if (x.equals(BigInteger.ZERO)) {
			return BigInteger.ONE;
		} else {
			return x.multiply(fact(x.subtract(BigInteger.ONE)));
		}
	}

}
