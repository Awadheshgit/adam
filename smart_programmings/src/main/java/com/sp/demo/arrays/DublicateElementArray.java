package com.sp.demo.arrays;

import java.util.HashSet;

public class DublicateElementArray {
	public static void main(String[] args) {

		int[] array = { 6, 5, 3, 2, 5, 1, 2, 4 };
        
		//Because of -1 not in the element possition array
		int temp = -1;

		HashSet<Integer> hs = new HashSet<Integer>();
		// list traverse right hand side
		for (int i = array.length - 1; i >= 0; i--) {

			if (hs.contains(array[i])) {

				temp = i;

			} else {
				hs.add(array[i]);
			}
		}
		if (temp != -1) {
			System.out.println("First Dublicate Element : " + array[temp]);// Output : 5
		} else {
			System.out.println("No Dublicate Element : ");
		}
	}
}
