package com.sp.demo;

import java.util.ArrayList;

public class EvenOddNumbers {
	public static void main(String[] args) {

		int[] a = { 8, 5, 10, 12, 3, 1, 4 };

		ArrayList<Integer> al1 = new ArrayList<>();
		ArrayList<Integer> al2 = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {

				al1.add(a[i]);
			} else {
				al2.add(a[i]);
			}
		}
		
		int total1 = 0;
		System.out.println("Even Number's Are ");
		for (Integer number : al1) {
			
			total1 = total1 + number;
			System.out.print(number + " ");
			
		}
		System.out.println("total even number size: "+al1.size());
		System.out.println("Sum Of All Even Numbers: " + total1);
		System.out.println("................................");

		int total2 =0;
		System.out.println("Odd Number's Are ");
		for (Integer number : al2) {
			
			total2 = total2+number;
			System.out.print(number + " ");
			
		}
		System.out.println("total even number size "+al2.size());
		System.out.println("Sum of odd numbers "+total2);
	}
}
