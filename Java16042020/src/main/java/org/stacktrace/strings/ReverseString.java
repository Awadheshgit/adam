package org.stacktrace.strings;

public class ReverseString {
	public static void main(String[] args) {

		String str = "Java Developer";

		//1. Using the iterative method
		char[] strArray = str.toCharArray();
		for (int i = strArray.length - 1; i >= 0; i--) {
			System.out.print(" " + strArray[i]);
		}
		
		//2. Using StringBuffer class
		String str2 = " Happy Birthday ";
		
		StringBuffer sb = new StringBuffer(str2);
		System.out.println(sb.reverse());
	}
}
