package com.javasessions;

public class LoopsAssignment {

	public static void main(String[] args) {

		// 1.Writing a Program to print the following patterned output
		int i = 1;
		while (i <= 5) {
			System.out.println("I am Batman");
			i++;
		}

		System.out.println("*******************************");

		// 2.Writing a Program to print the following patterned output
		int k = 1;
		while (k <= 10) {
			System.out.println("I am Batman " + k);
			k++;
		}

		System.out.println("*******************************");

		// 3.WAP to print 10 to 1 using for, while and do-while loop

		// using for loop
		for (int j = 10; j >= 1; j--) {
			System.out.println(j);
		}

		System.out.println("*******");

		// using while loop
		int l = 10;
		while (l >= 1) {
			System.out.println(l);
			l--;
		}

		System.out.println("*******");

		// using do while loop
		int m = 10;
		do {
			System.out.println(m);
			m--;
		} while (m >= 1);

		System.out.println("*******************************");

		// 4.Write a program in Java to print "Hello World" ten times using
		// while loop

		int n = 1;
		while (n <= 10) {
			System.out.println("Hello World");
			n++;
		}

		System.out.println("*******************************");

		// 5.Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered

		int t = 1;
		while (t <= 10) {
			System.out.println(t);
			if (t % 7 == 0)
				break;
			
			t++;

		}

	}

}
