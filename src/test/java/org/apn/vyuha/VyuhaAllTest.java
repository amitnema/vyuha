package org.apn.vyuha;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.apn.vyuha.scala.Solution;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

/**
 * The Class VyuhaAllTest.
 *
 * @author Amit Nema
 */
public class VyuhaAllTest {

	/** The duplicate integer. */
	private final DuplicateInteger duplicateInteger = new DuplicateInteger();

	/** The binary gap. */
	private final BinaryGap binaryGap = new BinaryGap();

	/** The cyclic rotation. */
	private final CyclicRotation cyclicRotation = new CyclicRotation();

	/** The odd occurrences in array. */
	private final OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();

	/** The perm missing elem. */
	private final PermMissingElem permMissingElem = new PermMissingElem();

	/** The frog river one. */
	private final FrogRiverOne frogRiverOne = new FrogRiverOne();

	private final MissingInteger missingInteger = new MissingInteger();

	/** The solution. */
	private final Solution solution = new Solution();

	/**
	 * Dp find duplicate.
	 *
	 * @return the object[][]
	 */
	@DataProvider
	public Object[][] dpFindDuplicate() {
		return new Object[][] { new Object[] { Lists.newArrayList(2, 3, 4, 3, 2, 6, 4), Lists.newArrayList(3, 2, 4) },
				new Object[] { Lists.newArrayList(1, 5, 7, 4, 2, 3, 1, 5, 2), Lists.newArrayList(1, 5, 2) } };
	}

	/**
	 * Test find duplicate.
	 *
	 * @param Integers
	 *            the integers
	 * @param expected
	 *            the expected
	 */
	@Test(dataProvider = "dpFindDuplicate")
	public void testFindDuplicate(final List<Integer> Integers, final List<Integer> expected) {
		assertEquals(duplicateInteger.findDuplicates(Integers), expected);
	}

	/**
	 * Dp find binary gap.
	 *
	 * @return the object[][]
	 */
	@DataProvider
	public Object[][] dpFindBinaryGap() {
		return new Object[][] { new Object[] { 25, 2 }, new Object[] { 5265, 3 } };
	}

	/**
	 * Test find binary gap.
	 *
	 * @param n
	 *            the n
	 * @param expected
	 *            the expected
	 */
	@Test(dataProvider = "dpFindBinaryGap")
	public void testFindBinaryGap(final int n, final int expected) {
		assertEquals(binaryGap.findBinaryGap(n), expected);
	}

	/**
	 * Dp find cyclic rotation.
	 *
	 * @return the object[][]
	 */
	@DataProvider
	public Object[][] dpFindCyclicRotation() {
		return new Object[][] { new Object[] { new int[] { 5, 6, 3, 2, 1 }, 2, new int[] { 2, 1, 5, 6, 3 } },
				new Object[] { new int[] { 65, 95, 7, 21, 89 }, 4, new int[] { 95, 7, 21, 89, 65 } } };
	}

	/**
	 * Test find cyclic rotation.
	 *
	 * @param arr
	 *            the arr
	 * @param index
	 *            the index
	 * @param expected
	 *            the expected
	 */
	@Test(dataProvider = "dpFindCyclicRotation")
	public void testFindCyclicRotation(final int[] arr, final int index, final int[] expected) {
		assertEquals(cyclicRotation.findCyclicRotation(arr, index), expected);
	}

	/**
	 * Dp odd occurrences in array.
	 *
	 * @return the object[][]
	 */
	@DataProvider
	public Object[][] dpOddOccurrencesInArray() {
		return new Object[][] { new Object[] { new int[] { 5, 6, 1, 5, 6 }, 1 },
				new Object[] { new int[] { 65, 95, 65, 21, 95 }, 21 } };
	}

	/**
	 * Test odd occurrences in array.
	 *
	 * @param arr
	 *            the arr
	 * @param expected
	 *            the expected
	 */
	@Test(dataProvider = "dpOddOccurrencesInArray")
	public void testOddOccurrencesInArray(final int[] arr, final int expected) {
		assertEquals(oddOccurrencesInArray.findOddOccurrencesInArray(arr), expected);
	}

	/**
	 * Dp tape equilibrium.
	 *
	 * @return the object[][]
	 */
	@DataProvider
	public Object[][] dpTapeEquilibrium() {
		return new Object[][] { new Object[] { new int[] { 3, 1, 2, 4, 3 }, 1 },
				new Object[] { new int[] { 65, 95, 65, 21, 95 }, 21 } };
	}

	/**
	 * Test tape equilibrium.
	 *
	 * @param a
	 *            the a
	 * @param expected
	 *            the expected
	 */
	@Test(dataProvider = "dpTapeEquilibrium")
	public void testTapeEquilibrium(final int[] a, final int expected) {
		assertEquals(solution.tapeEquilibrium(a), expected);
	}

	/**
	 * Dp frog jump.
	 *
	 * @return the object[][]
	 */
	@DataProvider
	public Object[][] dpFrogJump() {
		return new Object[][] { new Object[] { 10, 85, 30, 3 }, new Object[] { 50, 135, 20, 5 } };
	}

	/**
	 * Test frog jump.
	 *
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param d
	 *            the d
	 * @param expected
	 *            the expected
	 */
	@Test(dataProvider = "dpFrogJump")
	public void testFrogJump(final int x, final int y, final int d, final int expected) {
		assertEquals(solution.frogJmp(x, y, d), expected);
	}

	/**
	 * Dp perm missing elem.
	 *
	 * @return the object[][]
	 */
	@DataProvider
	public Object[][] dpPermMissingElem() {
		return new Object[][] { new Object[] { new int[] { 3, 5, 1, 2 }, 4 },
				new Object[] { new int[] { 5, 6, 8, 7, 4, 9, 3, 2 }, 1 } };
	}

	/**
	 * Test perm missing elem.
	 *
	 * @param a
	 *            the a
	 * @param expected
	 *            the expected
	 */
	@Test(dataProvider = "dpPermMissingElem")
	public void testPermMissingElem(final int[] a, final int expected) {
		assertEquals(permMissingElem.findPermMissingElem(a), expected);
		assertEquals(solution.permMissingElem(a), expected);
	}

	/**
	 * Db perm check.
	 *
	 * @return the object[][]
	 */
	@DataProvider
	public Object[][] dbPermCheck() {
		return new Object[][] { new Object[] { new int[] { 3, 4, 1, 2 }, 0 },
				new Object[] { new int[] { 5, 6, 8, 7, 4, 9, 3, 2 }, 1 }, new Object[] { new int[] { 1, 1, 3 }, 1 } };

	}

	/**
	 * Test perm check.
	 *
	 * @param a
	 *            the a
	 * @param expected
	 *            the expected
	 */
	@Test(dataProvider = "dbPermCheck")
	public void testPermCheck(final int[] a, final int expected) {
		assertEquals(solution.permCheck(a), expected);
	}

	/**
	 * Test perm check 2.
	 *
	 * @param a
	 *            the a
	 * @param expected
	 *            the expected
	 */
	@Test(dataProvider = "dbPermCheck")
	public void testPermCheck2(final int[] a, final int expected) {
		assertEquals(solution.permCheck2(a), expected);
	}

	/**
	 * Db frog river one.
	 *
	 * @return the object[][]
	 */
	@DataProvider
	public Object[][] dpFrogRiverOne() {
		return new Object[][] { new Object[] { 5, new int[] { 1, 4, 2, 3, 5, 4 }, 4 },
				new Object[] { 5, new int[] { 1, 3, 1, 4, 2, 3, 5, 4 }, 6 },
				new Object[] { 5, new int[] { 3, 1, 4, 2, 3, 5, 4 }, 5 } };
	}

	/**
	 * Test frog river one.
	 *
	 * @param X
	 *            the x
	 * @param A
	 *            the a
	 * @param expected
	 *            the expected
	 */
	@Test(dataProvider = "dpFrogRiverOne")
	private void testFrogRiverOne(final int X, final int[] A, final int expected) {
		assertEquals(frogRiverOne.findFrogRiverOne(5, A), expected);
	}

	@DataProvider
	public Object[][] dpMissingInteger() {
		return new Object[][] { new Object[] { new int[] { 3, 1, 4, 2, 3, 5, 4 }, 1 } };
	}

	@Test(dataProvider = "dpMissingInteger")
	public void testMissingInteger(int[] A, int expected) {
		assertEquals(missingInteger.solution(A), expected);
	}
}
