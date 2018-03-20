/**
 * 
 */
package org.apn.vyuha;

import java.util.ArrayList;
import java.util.List;

/**
 * Find out duplicate int between 1 to N integers.<br/>
 * You are given an array of N+2 integer elements. All elements of the array are
 * in range 1 to N. And all elements occur once except two numbers which occur
 * twice. Find the two repeating numbers.
 * 
 * @author Amit Nema
 *
 */
public class DuplicateInteger {

	/**
	 * <pre>
	 * 1) Iterate the array from 1st element to last. 
	 * 2) 1st elements is 2 so check
	 * element in array with index 2 is >=0 if yes then change the element in array
	 * index 2 to -1*ar[abs(ar[i])] else print it. 
	 * Check ar[abs(ar[i])]>0 if yes den
	 * make it ar[abs(ar[i])]= - ar[abs(ar[i])] else printf the abs(ar[i])
	 * </pre>
	 * 
	 * @param integers
	 * @return
	 */
	public List<Integer> findDuplicates(final List<Integer> integers) {
		final Integer[] ints = integers.toArray(new Integer[0]);
		final List<Integer> result = new ArrayList<>();
		for (int i = 0; i < ints.length; i++) {
			final int val = ints[i];
			final int indexToConsider = Math.abs(val);
			if (ints[indexToConsider] >= 0) {
				ints[indexToConsider] = -1 * ints[indexToConsider];
			} else {
				result.add(Math.abs(val));
			}
		}
		return result;
	}
}
