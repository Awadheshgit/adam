package com.example.demo;

import java.util.StringTokenizer;

public class StringDemo {
	public static void main(String[] args) {

		/*
		 * String lineFromInpute = "What do you need frome me"; String[] words =
		 * lineFromInpute.split("\\s+");
		 * 
		 * System.out.println(words);
		 */
		
		String str = "The lazy fox jumped over the brown fence";
		StringTokenizer tokenizer = new StringTokenizer(str);
		
		while(tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}
	}
}
