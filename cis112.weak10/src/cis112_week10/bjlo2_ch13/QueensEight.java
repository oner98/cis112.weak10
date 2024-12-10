package cis112_week10.bjlo2_ch13;

/**
 * This class solves the eight queens problem using backtracking.
 */
public class QueensEight {
	
	public static void main(String[] args) {
		solve(new QueenPartialSolution(0));
	}

	/**
	 * Prints all solutions to the problem that can be extended from a given partial
	 * solution.
	 * 
	 * @param sol the partial solution
	 */
	public static void solve(QueenPartialSolution sol) {
		int exam = sol.examine();
		if (exam == QueenPartialSolution.ACCEPT) {
			System.out.println(sol);
		} else if (exam == QueenPartialSolution.CONTINUE) {
			for (QueenPartialSolution p : sol.extend()) {
				solve(p);
			}
		}
	}
	
}
