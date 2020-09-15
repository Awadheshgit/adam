package org.stacktrace;

public class StringDemo {

	public static void main(String[] args) {

		String s1 = new String("bhasker");
		
		String s5 = new String("bhasker");

		String s2 = s1.intern();

		String s3 = "bhasker";

		System.out.println(s2 == s3);
		System.out.println(s2.equals(s3));
		
		System.out.println(s1==s5);
		System.out.println(s1.equals(s5));
	}
}
