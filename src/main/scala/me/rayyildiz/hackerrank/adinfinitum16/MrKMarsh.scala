package me.rayyildiz.hackerrank.adinfinitum16

/**
  * Created by rayyildiz on 9/2/16.
  */
object MrKMarsh {

  def main(args: Array[String]): Unit = {
    val line = scala.io.StdIn.readLine().split(" ")

    val m = line(0).toInt
    val n = line(1).toInt

    val arr = Array.ofDim[Char](m, n)

    val numbers = for (i <- 0 until m) yield scala.io.StdIn.readLine().toCharArray.toList.take(n)

    for (row      <- numbers.indices) {
      for (column <- numbers(row).indices) {
        arr(row)(column) = numbers(row)(column)
      }
    }

  }

}
