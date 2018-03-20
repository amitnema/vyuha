package org.apn.vyuha;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

/**
 * 
 * @author Amit Nema
 *
 */
public class VyuhaAllTest {

	private DuplicateInteger duplicateInteger = new DuplicateInteger();
	private BinaryGap binaryGap = new BinaryGap();
	private CyclicRotation cyclicRotation = new CyclicRotation();
	private OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();

	@DataProvider
	public Object[][] dpFindDuplicate() {
		return new Object[][] { new Object[] { Lists.newArrayList(2, 3, 4, 3, 2, 6, 4), Lists.newArrayList(3, 2, 4) },
				new Object[] { Lists.newArrayList(1, 5, 7, 4, 2, 3, 1, 5, 2), Lists.newArrayList(1, 5, 2) } };
	}

	@Test(dataProvider = "dpFindDuplicate")
	public void testFindDuplicate(final List<Integer> Integers, final List<Integer> expected) {
		assertEquals(duplicateInteger.findDuplicates(Integers), expected);
	}

	@DataProvider
	public Object[][] dpFindBinaryGap() {
		return new Object[][] { new Object[] { 25, 2 }, new Object[] { 5265, 3 } };
	}

	@Test(dataProvider = "dpFindBinaryGap")
	public void testFindBinaryGap(final int n, final int expected) {
		assertEquals(binaryGap.findBinaryGap(n), expected);
	}

	@DataProvider
	public Object[][] dpFindCyclicRotation() {
		return new Object[][] { new Object[] { new int[] { 5, 6, 3, 2, 1 }, 2, new int[] { 2, 1, 5, 6, 3 } },
				new Object[] { new int[] { 65, 95, 7, 21, 89 }, 4, new int[] { 95, 7, 21, 89, 65 } } };
	}

	@Test(dataProvider = "dpFindCyclicRotation")
	public void testFindCyclicRotation(int[] arr, int index, int[] expected) {
		assertEquals(cyclicRotation.findCyclicRotation(arr, index), expected);
	}

	@DataProvider
	public Object[][] dpOddOccurrencesInArray() {
		return new Object[][] { new Object[] { new int[] { 5, 6, 1, 5, 6 }, 1 },
				new Object[] { new int[] { 65, 95, 65, 21, 95 }, 21 } };
	}

	@Test(dataProvider = "dpOddOccurrencesInArray")
	public void testOddOccurrencesInArray(int[] arr, int expected) {
		assertEquals(oddOccurrencesInArray.findOddOccurrencesInArray(arr), expected);
	}
}
