package me.rayyildiz.hackerrank.thirtydays

/**
  * Created by rayyildiz on 8/22/16.
  */
object Day6LetsReview {

  def main(args: Array[String]): Unit = {
    val t = scala.io.StdIn.readInt()
    val lines = for (i <- 1 to t) yield {
      scala.io.StdIn.readLine()
    }

    for (line <- lines) {
      val odds = for (j <- 0 until line.length) yield {
        if (j % 2 != 0) line.charAt(j).toString
        else ""
      }

      val evens = for (j <- 0 until line.length) yield {
        if (j % 2 == 0) line.charAt(j).toString
        else ""
      }

      println(s"${evens.mkString} ${odds.mkString} ")
    }
  }
}
