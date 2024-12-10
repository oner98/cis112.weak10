package cis112_week10.bjlo2_ch13;

/**
 * This program shows a solution for a Towers of Hanoi puzzle.
 */
public class TowersOfHanoi_Demo {
	
	public static void main(String[] args) {
		final int NDISKS = 5;
		TowersOfHanoi towers = new TowersOfHanoi(NDISKS);
		towers.move(NDISKS, 0, 2);
	}
	
}
