package cis112_week10.lab.ts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import cis112_week10.lab.Arithmetic;
import cis112_week10.lab.StudentInfo;

@TestMethodOrder(MethodOrderer.MethodName.class)

class TS_Arithmetic_jUnit {

	@Test
	void zz_jUnitWorking() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		StudentInfo.studentTag();
		System.out.println("You got one additional point since jUnit is working.");
	}

	/*
	 * sum
	 */

	@Test
	void sum_0_0() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		int expected = 0;
		int actual = Arithmetic.sum(0, 0); 
		assertEquals(expected, actual);
	}

	@Test
	void sum_1_0() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		int expected = 1;
		int actual = Arithmetic.sum(1, 0); 
		assertEquals(expected, actual);
	}

	@Test
	void sum_3_2() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		int expected = 5;
		int actual = Arithmetic.sum(3, 2); 
		assertEquals(expected, actual);
	}

	@Test
	void sum_5_2() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		int expected = 7;
		int actual = Arithmetic.sum(5, 2); 
		assertEquals(expected, actual);
	}

	/*
	 * prod
	 */

	@Test
	void prod_0_0() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		int expected = 0;
		int actual = Arithmetic.prod(0, 0); 
		assertEquals(expected, actual);
	}

	@Test
	void prod_1_0() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		int expected = 0;
		int actual = Arithmetic.prod(1, 0); 
		assertEquals(expected, actual);
	}

	@Test
	void prod_3_2() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		int expected = 6;
		int actual = Arithmetic.prod(3, 2); 
		assertEquals(expected, actual);
	}

	@Test
	void prod_5_2() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		int expected = 10;
		int actual = Arithmetic.prod(5, 2); 
		assertEquals(expected, actual);
	}

	/*
	 * pow
	 */

	@Test
	void pow_1_0() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		int expected = 1;
		int actual = Arithmetic.pow(1, 0); 
		assertEquals(expected, actual);
	}

	@Test
	void pow_2_4() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		int expected = 16;
		int actual = Arithmetic.pow(2, 4); 
		assertEquals(expected, actual);
	}

	@Test
	void pow_3_2() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		int expected = 9;
		int actual = Arithmetic.pow(3, 2); 
		assertEquals(expected, actual);
	}

	@Test
	void pow_5_2() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		int expected = 25;
		int actual = Arithmetic.pow(5, 2); 
		assertEquals(expected, actual);
	}

}
