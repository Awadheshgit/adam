package com.sp.demo.arrays;

public class Second_Largest {
	public static void main(String[] args) {

		int[] a = { 6, 8, 2, 4, 3, 1, 5, 7 };

		int largest = Integer.MIN_VALUE;
		int second_largest = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {

			if (a[i] > largest) {

				second_largest = largest;
				largest = a[i];
			} else if (a[i] > second_largest && a[i] != largest) {
				second_largest = a[i];
			}
		}

		if (second_largest == Integer.MIN_VALUE) {
			System.out.println("There is no second largest element in list: ");
		} else {
			System.out.println("second largest element : " + second_largest);
		}
	}
}
