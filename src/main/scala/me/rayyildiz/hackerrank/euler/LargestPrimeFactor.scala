package me.rayyildiz.hackerrank.euler

/**
  * Created by rayyildiz on 8/19/16.
  */
object LargestPrimeFactor {

  def isPrime(number: Long): Boolean = {
    if (number > 0) {
      (2L until number) forall (d => number % d != 0)
    } else {
      throw new Exception("Only pozitive numbers will be prime or not")
    }
  }

  private def findMaxPrimeNumbers(num: Long): Long = {
    @scala.annotation.tailrec
    def acc(n: Long): Long = {
      if (num % n == 0 && isPrime(n)) n
      else acc(n - 1)
    }

    val sqrt = Math.sqrt(num).toLong
    println(s" sqrt: $sqrt")
    acc((num / sqrt))
  }

  def main(args: Array[String]): Unit = {

    val count = scala.io.StdIn.readInt()

    val xs = for (i <- 1 to count) yield scala.io.StdIn.readInt()

    for (x <- xs) {
      val f = findMaxPrimeNumbers(x)
      println(f)
    }

  }
}
