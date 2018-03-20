package org.apn.vyuha.scala

object Triangle {

  def main(args: Array[String]): Unit = {
    val n = 10
    upLeftPeakTriangle(n)
    downLeftPeakTriangle(n)
    upRightPeakTriangle(n)
    downRightPeakTriangle(n)
  }

  def upLeftPeakTriangle(n: Int) = {
    for (x <- 1 to n) {
      for (y <- 1 to x) {
        print("*")
      }
      println("")
    }
  }

  def downLeftPeakTriangle(n: Int) = {
    for (x <- n to 1 by -1) {
      for (y <- 1 to x) {
        print("*")
      }
      println("")
    }
  }

  def upRightPeakTriangle(n: Int) = {
    for (x <- 1 to n) {
      for (y <- 1 to n - x) {
        print(" ")
      }
      for (z <- 1 to x) {
        print("*")
      }
      println
    }
  }

  def downRightPeakTriangle(n: Int) = {
    for (x <- n to 1 by -1) {
      for (y <- 1 to n - x) {
        print(" ")
      }
      for (z <- 1 to x) {
        print("*")
      }
      println
    }
  }

}