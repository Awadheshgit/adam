package com.sp.demo;

public class Palindrome_Number {
	public static void main(String[] args) {

		int no = 13021;

		// Store the value in temp because your original value will be safe
		int temp = no;

		int rev = 0, rem;

		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}

		if (no == rev) {
			System.out.println(no + " is Palindrome Number");
		} else {
			System.out.println(no + " is not Palindrome Number");
		}

	}
}
