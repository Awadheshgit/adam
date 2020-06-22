package org.stacktrace.arrays;

public class FindMissingNumber {
	public static void main(String[] args) {

		int[] arrays = { 0, 1, 2, 4, 6, 7, 9 };

		int n = arrays.length + 1;

		int sumOfN = (n * (n + 1)) / 2;

		System.out.println("Sum of the n : " + sumOfN);

		int sum = 0;

		for (int i = 0; i < n - 1; i++) {
			sum = sum + arrays[i];
		}

		int missingNumber = sumOfN - sum;
		System.out.println("Missing number in Arrays : " + missingNumber);

	}
}
