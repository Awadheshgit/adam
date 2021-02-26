package com.sp.demo;

public class SwapTwoNumber {
	public static void main(String[] args) {

		int a = 10, b = 20;

		// a = a + b;
		// b = a - b;
		// a = a - b;
		int t;

		t = a;
		a = b;
		b = t;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
