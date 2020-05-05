package org.stacktrace.strings;

public class WordReverse {
	public static void main(String[] args) {

		String str = "Happy";

		String[] words = str.split("");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(" " + words[i]);
		}
	}
}
