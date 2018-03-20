/**
 * 
 */
package org.apn.vyuha;

/**
 * 
 * A zero-indexed array A consisting of N integers is given. Rotation of the
 * array means that each element is shifted right by one index, and the last
 * element of the array is moved to the first place. For example, the rotation
 * of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right
 * by one index and 6 is moved to the first place).
 * 
 * @author Amit Nema
 *
 */
public class CyclicRotation {

	public int[] findCyclicRotation(final int[] arr, final int index) {
		int size = arr.length;
		final int[] result = new int[arr.length];
		for (int x = 0; x < size; x++) {
			result[(x + index) % size] = arr[x];
		}
		return result;
	}
}
