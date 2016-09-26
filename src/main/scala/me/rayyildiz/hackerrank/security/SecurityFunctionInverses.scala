package me.rayyildiz.hackerrank.security

/**
  * Created by rayyildiz on 8/30/16.
  */
object SecurityFunctionInverses {

  def main(args: Array[String]): Unit = {
    val n       = scala.io.StdIn.readInt()
    val line    = scala.io.StdIn.readLine()
    val numbers = line.split(" ").take(n).map(_.toInt)

    val maps     = for (indices <- numbers.indices) yield (indices + 1, numbers(indices))
    val map2     = maps.map(x => (x._2, x._1))
    val inverted = for (a <- maps) yield (numbers(a._2 - 1))

    println(maps)
    println(map2)
    println(inverted)

    map2.foreach(x => println(numbers(x._1 - 1)))

  }
}
