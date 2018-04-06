package org.apn.vyuha;

/**
 * 
 * <blockquote>Find value that occurs in odd number of elements. </blockquote>
 * 
 * <p>
 * A non-empty zero-indexed array A consisting of N integers is given. The array
 * contains an odd number of elements, and each element of the array can be
 * paired with another element that has the same value, except for one element
 * (i.e. the result) that is left unpaired.
 * </p>
 * 
 * @author Amit Nema
 *
 */
public class OddOccurrencesInArray {
	public int findOddOccurrencesInArray(int[] arr) {
		int result = 0;
		// Using extensive-OR : "A or B, but not, A and B"
		for (int i : arr) {
			result ^= i;
		}
		return result;
	}
}
