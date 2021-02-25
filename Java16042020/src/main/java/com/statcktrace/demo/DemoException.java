package com.statcktrace.demo;

public class DemoException {
	public static void main(String[] args) {

		try {
			System.out.println("Statement-1");
			System.out.println("Statmement-2");
			System.out.println("Statement-3");
			try {
				System.out.println("Statement-4");
				System.out.println("Statmement-5");
				System.out.println("Statement-6");

			} catch (ArithmeticException ae) {
				System.out.println("statement-7");
			} finally {
				System.out.println("Statement-8");
			}
			System.out.println("Statement-9");

		} catch (Exception e) {
			System.out.println("Statement-10");
		} finally {
			System.out.println("Statement-11");
		}
		System.out.println("Statement-12");
	}

}
