package sandbox;

import java.util.Scanner;

public class equivalent {
	public static void main(String args[]) {
		int[] x = new int[5];
		int[] y = new int[5];
		System.out.println("Enter 5 pairs of ints and we will tell you if they are equivalent:");
		Scanner kbd = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			x[i] = kbd.nextInt();
			y[i] = kbd.nextInt();
		}
		boolean equiv = false;
		// ---- Given that x, y are int arrays of length 5. Write the statements to
		// check if x and y contain the same values in the same indices. If so, assign
		// true to the boolean variable equiv, else assign false to equiv
		check: if (x.getClass().equals(y.getClass()) && x.length == y.length) {
			for (int j = 0; j < 5; j++) {
				if (x[j] == y[j])
					equiv = true;
				else {
					equiv = false;
					break check;
				}
			}
		} else
			equiv = false;
		System.out.print(equiv);
	}
}
