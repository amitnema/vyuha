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
  def tapeEquilibrium(A: Array[Int]): Int = {
    var minDiff = Int.MaxValue;
    var total = A.reduce({ _ + _ })
    var prev = 0
    var next = total;

    for (p <- 1 to A.length) {
      prev += A(p - 1)
      next = total - prev
      minDiff = math.min(minDiff, math.abs(prev - next))
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
   * Reference https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
   */
  def frogJmp(x: Int, y: Int, d: Int): Int = {
    math.ceil((y - x).toDouble / d).toInt
  }

}