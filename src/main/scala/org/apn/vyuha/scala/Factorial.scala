package org.apn.vyuha.scala

import scala.annotation.tailrec

object Factorial {

  def main(args: Array[String]): Unit = {
    val n = 5
    print(factorial1(n))
  }
  /**
   * without tail recursion
   *
   */
  def factorial0(n: Int): Int = if (n == 1) 1 else n * factorial0(n - 1)

  /**
   * with tail recursion
   *
   */
  def factorial1(n: Int): Int = {
    @tailrec
    def tailRecFunc(n: Int, result: Int): Int = {
      if (n == 1) result else tailRecFunc(n - 1, result * n)
    }
    tailRecFunc(n, 1)
  }

}