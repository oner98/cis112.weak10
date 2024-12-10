package cis112_week10.bjlo2_ch13;

import java.util.Scanner;

/**
 * This program computes Fibonacci numbers using a recursive method.
 */
public class FibRecursive {

	public static void main(String[] args) {
		int n = 0;
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("Enter n: ");
			n = in.nextInt();
		}
		for (int i = 1; i <= n; i++) {
			long f = fib(i);
			System.out.println("fib(" + i + ") = " + f);
		}
	}

	/**
	 * Computes a Fibonacci number.
	 * 
	 * @param n an integer
	 * @return the nth Fibonacci number
	 */
	public static long fib(int n) {
		if (n <= 2) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

}
