package me.rayyildiz.hackerrank.algorithm

/**
  * Created by rayyildiz on 8/22/16.
  */
object VeryBigSum {

  def main(args: Array[String]): Unit = {
    val t    = scala.io.StdIn.readInt()
    val line = scala.io.StdIn.readLine()

    val parts  = line.split(" ").take(t)
    val digits = for (part <- parts) yield BigDecimal.apply(part)

    println(digits.sum)
  }

}
