package org.stacktrace.arrays;

import java.sql.Array;
import java.util.Arrays;

public class SortArrays {
	public static void main(String[] args) {

		// Initialize the array
		Integer[] arrays = { 2, 3, 4, 7, 5, 9, 8, 34, 23 };
		Integer temp = 0;

		// Displaying element of the original arrays
		System.out.println("Element of the original arrays: ");
		for (int i = 0; i < arrays.length; i++) {
			System.out.print(" " + arrays[i]);
		}

		// Sort the element in acceding order
		for (int i = 0; i < arrays.length; i++) {
			for (int j = i + 1; j < arrays.length; j++) {
				if (arrays[i] > arrays[j]) {
					temp = arrays[i];
					arrays[i] = arrays[j];
					arrays[j] = temp;
				}
				
			}
		}
		System.out.println();

		// Displaying the element in after sorting
		System.out.println(" After sorting the arrays: ");
		for (int i = 0; i < arrays.length; i++) {
			System.out.print(" " + arrays[i]);
			
		}
		
	}
}
