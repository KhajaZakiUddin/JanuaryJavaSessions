package com.javasessions;

import java.util.Scanner;

public class Assignment {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 1.Java program to print 'Hello' on screen and then print your name on a separate line

		System.out.println("Hello");
		System.out.print("Khaja ZakiUddin");
		System.out.println();                                                   // Mentioned this additional statement for the next steps to be in a new line

		// 2.Write a Java program to print the sum of two numbers.

		System.out.println("*************************************************");
		System.out.println(74 + 36);

		// 3.Write a Java program to divide two numbers and print on the screen.
		System.out.println("*************************************************");
		System.out.println(50 / 3);

		// 4.Write a Java program to print the result of the following
		// operations.
		System.out.println("*************************************************");
		System.out.println(-5 + 8 * 6);
		System.out.println((55 + 9) % 9);
		System.out.println(20 + -3 * 5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3); // apply BODMAS rule here
		System.out.println(25 * 2 + 8 - 3 / 2);

		// 5.Write a Java program to compute the specified expressions and print
		// the output.
		System.out.println("*************************************************");
		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));

		// Conditional Operators.

		// 1.Finding the greatest number out of the three integers given by the
		// user
		System.out.println("*************************************************");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter three integers:");
		int x = s.nextInt();
		int y = s.nextInt();
		int z = s.nextInt();

		if (x > y && x > z) {
			System.out.println("The greatest number is x: " + x);
		} else if (y > z) {
			System.out.println("The greatest number is y: " + y);
		} else {
			System.out.println("The greatest number is z: " + z);
		}

		// 2.Finding the input number is positive or negative
		System.out.println("*************************************************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		if (n > 0) {
			System.out.println(n + " is positive");
		} else if (n < 0) {
			System.out.println(n + " is negative");
		} else {
			System.out.println(n + " is not a valid number");
		}

	}

}
