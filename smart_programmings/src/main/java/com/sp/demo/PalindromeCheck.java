package com.sp.demo;


// wrong program
public class PalindromeCheck {

	boolean checkPalindromeString(String input) {
		boolean result = true;

		int length = input.length();

		for (int i = 0; i < length / 2; i++) {

			if (input.charAt(i) != input.charAt(length - i - 1)) {
				result = false;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {

		PalindromeCheck ch = new PalindromeCheck();
		ch.checkPalindromeString("121");
	}
}