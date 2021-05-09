package com.sp.demo.arrays;

public class FindMissingNumberIn_Arrays {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 6, 8,9 };

		int expeted_no_element = a.length + 1;

		int total_sum = expeted_no_element * (expeted_no_element + 1) / 2;

		//System.out.println(total_sum);

		int sum = 0;

		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];
		}
		System.out.println("Missing number is: " + (total_sum - sum));
	}
}
