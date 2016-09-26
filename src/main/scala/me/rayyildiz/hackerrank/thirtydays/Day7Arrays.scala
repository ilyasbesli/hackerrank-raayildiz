package me.rayyildiz.hackerrank.thirtydays

/**
  * Created by rayyildiz on 8/23/16.
  */
object Day7Arrays {

  def main(args: Array[String]): Unit = {
    val n    = scala.io.StdIn.readInt()
    val line = scala.io.StdIn.readLine()
    println(line.split(" ").take(n).map(_.toInt).reverse.mkString(" "))
  }
}
