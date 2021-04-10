package com.sp.demo.arrays;

import java.util.HashSet;

public class RemoveDublicateInShortedArray {
	public static void main(String[] args) {

		int[] array = { 1, 2, 2, 3, 4, 5, 5 };

		HashSet<Integer> hs = new HashSet<Integer>();

		for (int i = 0; i < array.length; i++) {

			hs.add(array[i]);
		}

		for (Integer number : hs) {
			System.out.print(number+" ");
		}
	}
}
