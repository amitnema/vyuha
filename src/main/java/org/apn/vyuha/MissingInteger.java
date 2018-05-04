package org.apn.vyuha;

/**
 * Find the smallest positive integer that does not occur in a given sequence.
 * 
 * @author Amit Nema
 */
public class MissingInteger {

	public int solution(int[] A) {
		int result = Integer.MAX_VALUE;
		for (int element : A) {
			result = Math.min(result, element);
		}
		return result;
	}

}
