package me.rayyildiz.hackerrank.thirtydays

/**
  * Created by rayyildiz on 8/27/16.
  */
object Day112DArrays {

  def main(args: Array[String]): Unit = {
    val lines = for (i <- 0 until 6) yield scala.io.StdIn.readLine()

    val arr = for (line <- lines) yield (line.split(" ").map(_.toInt)).toList

    val allSum = for (i <- 0 to arr.length - 3) yield {

      val sum = for (j <- 0 to arr(i).length - 3) yield {
        arr(i)(j) + arr(i)(j + 1) + arr(i)(j + 2) + arr(i + 1)(j + 1) + arr(i + 2)(j) + arr(i + 2)(j + 1) + arr(i + 2)(
          j + 2)
      }

      sum.toList.max
    }

    println(allSum.max)
  }
}
