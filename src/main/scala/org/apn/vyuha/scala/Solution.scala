package org.apn.vyuha.scala

class Solution {
  /**
    *
    * <pre>
    * A non-empty zero-indexed array A consisting of N integers is given. Array A
    * represents numbers on a tape.
    *
    * Any integer P, such that 0 < P < N, splits this tape into two non-empty
    * parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
    *
    * The difference between the two parts is the value of: |(A[0] + A[1] + ... +
    * A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
    *
    * In other words, it is the absolute difference between the sum of the first
    * part and the sum of the second part.
    *
    * For example, consider array A such that: A[0] = 3 A[1] = 1 A[2] = 2 A[3] = 4
    * A[4] = 3
    *
    * We can split this tape in four places:
    *
    * P = 1, difference = |3 − 10| = 7 P = 2, difference = |4 − 9| = 5 P = 3,
    * difference = |6 − 7| = 1 P = 4, difference = |10 − 3| = 7
    *
    * Write a function:
    *
    * class Solution { public int solution(int[] A); }
    *
    * that, given a non-empty zero-indexed array A of N integers, returns the
    * minimal difference that can be achieved.
    *
    * For example, given: A[0] = 3 A[1] = 1 A[2] = 2 A[3] = 4 A[4] = 3
    *
    * the function should return 1, as explained above.
    * </pre>
    *
    *
    */
  def tapeEquilibrium(A: Array[ Int ]): Int = {
    var minDiff = Int.MaxValue;
    var total = A.reduce ( {
      _ + _
    } )
    var prev = 0
    var next = total;

    for (p <- 1 to A.length) {
      prev += A ( p - 1 )
      next = total - prev
      minDiff = math.min ( minDiff, math.abs ( prev - next ) )
    }
    minDiff
  }

  /**
    * A small frog wants to get to the other side of the road.
    * The frog is currently located at position X and wants to get to a position greater than or equal to Y.
    * The small frog always jumps a fixed distance, D.
    *
    * Count the minimal number of jumps that the small frog must perform to reach its target.
    * </ br>
    * Assume that:
    *
    * X, Y and D are integers within the range [1..1,000,000,000];
    * X ≤ Y.
    *
    * </br>
    * Reference: https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
    */
  def frogJmp(x: Int, y: Int, d: Int): Int = {
    math.ceil ( (y - x).toDouble / d ).toInt
  }

  /**
    * A zero-indexed array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
    *
    * Your goal is to find that missing element.
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
    * < /br>
    * Reference: https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
    */
  def permMissingElem(a: Array[ Int ]): Int = {
    val length = a.length
    //sum of all the elements in the range 1 to N
    val sum = length * (length + 1) / 2
    var missingVal = sum;
    a.foreach ( x => {
      //Do not consider the (n+1)th element from the array
      if (x != length + 1) {
        //removing all the element from the totals
        missingVal = missingVal - x
      }
    } )
    missingVal
  }

  /**
    * A non-empty zero-indexed array A consisting of N integers is given.
    *
    * A permutation is a sequence containing each element from 1 to N once, and only once.
    * </ br>
    * that, given a zero-indexed array A, returns 1 if array A is a permutation and 0 if it is not.
    * </br>
    * Assume that:
    *
    * N is an integer within the range [1..100,000];
    * each element of array A is an integer within the range [1..1,000,000,000].
    *
    */
  def permCheck(a: Array[ Int ]): Int = {
    val l = a.length
    val sum = l * (l + 1) / 2
    var diff = sum
    a.foreach ( i => {
      diff = diff - i
    } )
    if (diff == 0) 1 else 0
  }

  def permCheck2(a: Array[ Int ]): Int = {
    val exists: Array[ Boolean ] = new Array[ Boolean ]( a.length + 1 )
    a.foreach ( i => {
      if (i < 1 || i > a.length) {
        return 0
      }
      if (exists ( i )) {
        return 0
      } else exists ( i ) = true
    } )
    return 1
  }

  /**
    * <pre>
    * A small frog wants to get to the other side of a river. The frog is initially located on one bank of the river (position 0) and wants to get to the opposite bank (position X+1).
    * Leaves fall from a tree onto the surface of the river.
    *
    * You are given a zero-indexed array A consisting of N integers representing the falling leaves. A[K] represents the position where one leaf falls at time K, measured in seconds.
    *
    * The goal is to find the earliest time when the frog can jump to the other side of the river. The frog can cross only when leaves appear at every position across the river from 1 to X
    * (that is, we want to find the earliest moment when all the positions from 1 to X are covered by leaves). You may assume that the speed of the current in the river is negligibly small,
    * i.e. the leaves do not change their positions once they fall in the river.
    *
    * For example, you are given integer X = 5 and array A such that:
    * A[0] = 1
    * A[1] = 3
    * A[2] = 1
    * A[3] = 4
    * A[4] = 2
    * A[5] = 3
    * A[6] = 5
    * A[7] = 4
    *
    * In second 6, a leaf falls into position 5. This is the earliest time when leaves appear in every position across the river.
    * </pre>
    * Reference: https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one
    */
  def frogRiverOne(x: Int, a: Array[ Int ]): Int = {
    var steps = x
    val bitmap = new Array[ Boolean ]( steps + 1 )
    for (i <- 0 until a.length) {
      print ( "| i=" + i + "; steps=" + steps )
      if (!bitmap ( a ( i ) )) {
        bitmap ( a ( i ) ) = true
        steps -= 1
      }
      if (steps == 0) steps
    }
    println ( "| \n bitmap=" + bitmap.mkString ( "," ) )

    -1
  }

}