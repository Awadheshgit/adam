package org.stacktrace.demo;

public class ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {

		String[] argh = { "A", "B" };

		args = argh;
		System.out.println(argh.length);

		for (int i = 0; i <= argh.length; i++) {
			System.out.println(argh[i]);
		}
	}
}
