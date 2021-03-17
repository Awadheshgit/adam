package com.sp.demo;

public class ReverseNumber {
	public static void main(String[] args) {

		int no = 4993, rem, rev = 0;

		while (no != 0) {

			rem = no % 10;

			rev = rev * rem + rem;

			no = no / 10;

		}
		System.out.println(rev);
	}
}
