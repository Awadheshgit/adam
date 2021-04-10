package com.sp.demo.arrays;

import java.util.Arrays;

public class Interview {
	public static void main(String[] args) {

		int[] a = { 2, 8, 1, -3, 6, 7, 5, 4, -12, 82, 31, -34, 56, -76, 57, 84 };

		int size = a.length;

		Arrays.sort(a);

		System.out.println("Sorted Arrays" + Arrays.toString(a));

		int rev = a[size - 1];

		System.out.println("Second Largest : = " + rev);
		System.out.println("Second Smallest : = "+ a[5]);

	}
}
