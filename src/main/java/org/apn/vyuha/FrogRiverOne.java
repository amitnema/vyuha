package org.apn.vyuha;

/**
 * The Class FrogRiverOne.
 */
public class FrogRiverOne {

	/**
	 * Find frog river one.
	 *
	 * @param X
	 *            the x
	 * @param A
	 *            the a
	 * @return the int
	 */
	public int findFrogRiverOne(int X, int[] A) {
		int steps = X;
		boolean[] bitmap = new boolean[steps + 1];
		for (int i = 0; i < A.length; i++) {
			if (!bitmap[A[i]]) {
				bitmap[A[i]] = true;
				steps--;
			}
			if (steps == 0)
				return i;
		}
		return -1;
	}
}
