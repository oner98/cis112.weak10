package cis112_week10.bjlo2_ch13;

import java.util.Scanner;

/**
 * This program prints trace messages that show how often the recursive method
 * for computing Fibonacci numbers calls itself.
 */
public class FibRecursive_Tracer {

	public static void main(String[] args) {
		int n = 0;
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("Enter n: ");
			n = in.nextInt();
		}

		long f = fib(n);

		System.out.println("fib(" + n + ") = " + f);
	}

	/**
	 * Computes a Fibonacci number.
	 * 
	 * @param n an integer
	 * @return the nth Fibonacci number
	 */
	public static long fib(int n) {
		System.out.println("->fib: n = " + n);
		long f;
		if (n <= 2) {
			f = 1;
		} else {
			f = fib(n - 1) + fib(n - 2);
		}
		System.out.println("-<fib: n = " + n + " return value = " + f);
		return f;
	}

}
