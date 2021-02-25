package com.sp.demo;

class Test {

	Object show() {
		System.out.println("1");
		return null;
	}
}

class Xyz extends Test {

	String show() {
		System.out.println("2");
		return null;
	}

	public static void main(String[] args) {

		Test obj1 = new Test();
		obj1.show();
		
		Xyz obj2 = new Xyz();
		obj2.show();
	}
}