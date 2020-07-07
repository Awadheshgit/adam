package org.stacktrace.anonymous;

class PopCorn {
	public void taste() {
		System.out.println("Spicy");
	}
}

public class Test {
	public static void main(String[] args) {

		PopCorn p = new PopCorn() {
			public void taste() {
				System.out.println("Salty");
			}
		};
		p.taste();// Salty
		PopCorn p1 = new PopCorn();
		p1.taste();// Spicy
	}
}
