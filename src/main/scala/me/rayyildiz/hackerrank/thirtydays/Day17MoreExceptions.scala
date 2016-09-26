package me.rayyildiz.hackerrank.thirtydays

/**
  * Created by rayyildiz on 9/2/16.
  */
object Day17MoreExceptions {
  class Calculator {

    def power(n: Int, p: Int): Int = {
      if (n < 0 || p < 0) throw new Exception("n and p should be non-negative")
      Math.pow(n, p).toInt
    }
  }

  def main(args: Array[String]): Unit = {
    val myCalculator = new Calculator()
    var T            = scala.io.StdIn.readLine().toInt

    while (T > 0) {
      val Array(n, p) = scala.io.StdIn.readLine().split(" ").map(_.toInt);
      try {
        val ans = myCalculator.power(n, p)
        println(ans);
      } catch {
        case e: Exception => {
          println(e.getMessage())
        }
      }
      T -= 1
    }
  }
}
