package me.rayyildiz.hackerrank.algorithm

/**
  * Created by rayyildiz on 8/22/16.
  */
object DiagonalDifference {

  def main(args: Array[String]): Unit = {
    val t = scala.io.StdIn.readInt()

    val numbersStr = for (i <- 0 until t) yield {
      scala.io.StdIn.readLine()
    }

    val numbers = numbersStr.map(_.split(" ").take(t).map(_.toInt))

    val sum1 = for (i <- 0 until t) yield {
      numbers(i)(i)
    }

    val sum2 = for (i <- 0 until t) yield {
      numbers(t - i - 1)(i)
    }

    println(Math.abs(sum1.sum - sum2.sum))
  }
}
