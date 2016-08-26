package me.rayyildiz.hackerrank.thirtydays

/**
  * Created by rayyildiz on 8/26/16.
  */
object Day10BinaryNumbers {

  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readInt()
    println(Integer.toBinaryString(n).split("0").map(_.length).max)
  }
}
