package com.sp.demo;

// This program data inconsistency problem
class BookTheaterSeat {
	int total_seats = 10;

	void bookSeats(int seats) {

		if (total_seats >= seats) {
			System.out.println(seats + " seats booked successfully ");
			total_seats = total_seats - seats;
			System.out.println(" seats left " + total_seats);
		} else {
			System.out.println(" sorry seats can not be booked... ");
			System.out.println(" seats left " + total_seats);
		}
	}
}

public class Movies_Book_App extends Thread {

	static BookTheaterSeat b;
	int seats;

	// both thread will be start same time awadhesh and nitesh
	public void run() {
		b.bookSeats(seats);
	}

	public static void main(String[] args) {

		b = new BookTheaterSeat();

		Movies_Book_App awadhesh = new Movies_Book_App();
		awadhesh.seats = 7;
		awadhesh.start();

		Movies_Book_App nitesh = new Movies_Book_App();
		nitesh.seats = 6;
		nitesh.start();
	}
}
