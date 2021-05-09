package com.sp.demo.arrays;

public class SecondLargestNumberIn_Arrays {
	public static void main(String[] args) {

		int[] arr = { 6, 8, 2, 4, 3};

		int temp;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				// swap condition
				if (arr[i] < arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		
		System.out.print("second largest number: " + arr[1]);
	}
}
