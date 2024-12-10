package cis112_week10.lab.ts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import cis112_week10.lab.OccuranceNumber;
import cis112_week10.lab.StudentInfo;

@TestMethodOrder(MethodOrderer.MethodName.class)

class TS_OccuranceNumber_jUnit {

	@Test
	void zz_jUnitWorking() {
		System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		StudentInfo.studentTag();
		System.out.println("You got one additional point since jUnit is working.");
	}

	/*
	 * recursiveCount
	 */

	@Test
	void recursiveCount_a() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String text = "a";
		String searched = "ab";

		int expected = 0;
		int actual = OccuranceNumber.recursiveCount(text, searched);
		assertEquals(expected, actual);
	}

	@Test
	void recursiveCount_ab() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String text = "ab";
		String searched = "ab";

		int expected = 1;
		int actual = OccuranceNumber.recursiveCount(text, searched);
		assertEquals(expected, actual);
	}

	@Test
	void recursiveCount_abab() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String text = "abab";
		String searched = "ab";

		int expected = 2;
		int actual = OccuranceNumber.recursiveCount(text, searched);
		assertEquals(expected, actual);
	}

	@Test
	void recursiveCount_ababab() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String text = "ababab";
		String searched = "ab";

		int expected = 3;
		int actual = OccuranceNumber.recursiveCount(text, searched);
		assertEquals(expected, actual);
	}

	@Test
	void recursiveCount_c() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String text = "c";
		String searched = "cc";

		int expected = 0;
		int actual = OccuranceNumber.recursiveCount(text, searched);
		assertEquals(expected, actual);
	}

	@Test
	void recursiveCount_cc() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String text = "cc";
		String searched = "cc";

		int expected = 1;
		int actual = OccuranceNumber.recursiveCount(text, searched);
		assertEquals(expected, actual);
	}

	@Test
	void recursiveCount_ccc() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String text = "ccc";
		String searched = "cc";

		int expected = 2;
		int actual = OccuranceNumber.recursiveCount(text, searched);
		assertEquals(expected, actual);
	}

	@Test
	void recursiveCount_cccc() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		String text = "cccc";
		String searched = "cc";

		int expected = 3;
		int actual = OccuranceNumber.recursiveCount(text, searched);
		assertEquals(expected, actual);
	}

}
