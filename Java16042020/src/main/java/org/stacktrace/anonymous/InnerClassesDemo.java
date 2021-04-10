package org.stacktrace.anonymous;

public class InnerClassesDemo {
	public static void main(String[] args) {

		// Here we are not creating for runnable interface
		// We are creating Implements class object
		/*Runnable r = new Runnable() {

			@Override
			public void run() {

				for (int i = 0; i < 10; i++) {
					System.out.println("Child Thread");
				}
			}
		};*/
		Runnable r = () -> {
			for(int i=0; i<10; i++) {
			System.out.println("child thread");
			}
		
		};
		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}
