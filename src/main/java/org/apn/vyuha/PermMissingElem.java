package org.apn.vyuha;

/**
 * 
 * A zero-indexed array A consisting of N different integers is given. The array
 * contains integers in the range [1..(N + 1)], which means that exactly one
 * element is missing.
 *
 * Your goal is to find that missing element.
 * 
 * <pre>
 * Assume that:
 *
 * N is an integer within the range [0..100,000];
 * the elements of A are all distinct;
 * each element of array A is an integer within the range [1..(N + 1)].
 *
 *
 * </pre>
 *
 * < /br> Reference:
 * https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
 * 
 * @author Amit Nema
 *
 */
public class PermMissingElem {
	public int findPermMissingElem(int[] A) {
		long value = 0;
		int len = A.length;
		value = ((len * (len + 1)) / 2);
		for (int i = 0; i < len; i++) {
			if (!(A[i] == (len + 1))) {
				value -= A[i];
			}
		}
		return (int) value;
	}
}
