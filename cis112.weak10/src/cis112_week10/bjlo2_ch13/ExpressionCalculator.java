package cis112_week10.bjlo2_ch13;

import java.util.Scanner;

/**
 * This program calculates the value of an expression consisting of numbers,
 * arithmetic operators, and parentheses.
 */
public class ExpressionCalculator {

	public static void main(String[] args) {
		System.out.println("expression consisting of "
				+ "numbers, "
				+ "arithmetic operators, and "
				+ "parentheses"
				+ "such as (1+2)*(3+4)");
		String input = "";
		try (Scanner in = new Scanner(System.in)) {
			System.out.print("\nEnter an expression: ");
			input = in.nextLine();
		}
		Evaluator e = new Evaluator(input);
		int value = e.getExpressionValue();
		System.out.println(input + "=" + value);
	}

}
