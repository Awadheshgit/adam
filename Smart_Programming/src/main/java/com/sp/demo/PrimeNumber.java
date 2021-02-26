package com.sp.demo;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int no = sc.nextInt();
        
		int temp = 0;

		for (int i = 2; i <= no - 1; i++) {

			if (no % i == 0) {
				temp = temp + 1;
			}
		}
		if (temp == 0) {
			System.out.println(no + " Is prime number ");
		} else {
			System.out.println(no + " Is not prime number ");
		}
		sc.close();
	}
}
