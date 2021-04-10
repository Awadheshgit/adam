package com.sp.demo;

public class StringContainsVowels {
	public static void main(String[] args) {

		System.out.println(stringContainsVowels("This website is aw3som3")); // true
		System.out.println(stringContainsVowels("TV")); // false

	}

	public static boolean stringContainsVowels(String input) {

		return input.toLowerCase().matches(".*[aeiou].*");

	}

}