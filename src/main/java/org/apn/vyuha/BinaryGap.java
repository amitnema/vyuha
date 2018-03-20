package org.apn.vyuha;

/**
 * 
 * A binary gap within a positive integer N is any maximal sequence of
 * consecutive zeros that is surrounded by ones at both ends in the binary
 * representation of N.
 * 
 * @author Amit Nema
 *
 */
public class BinaryGap {

	/**
	 * Find longest sequence of zeros in binary representation of an integer.
	 */
	public int findBinaryGap(int n) {
		// if number is even
		while (n % 2 == 0) {
			n /= 2;
		}

		int binaryGap = 0;

		for (int tmpBinaryGap = 0; n > 0; n /= 2) {
			if (n % 2 == 0) {
				tmpBinaryGap++;
			} else {
				if (tmpBinaryGap > binaryGap) {
					binaryGap = tmpBinaryGap;
				}
				tmpBinaryGap = 0;
			}
		}
		return binaryGap;
	}
}
