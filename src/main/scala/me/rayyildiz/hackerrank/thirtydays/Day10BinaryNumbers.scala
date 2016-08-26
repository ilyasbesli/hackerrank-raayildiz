package me.rayyildiz.hackerrank.thirtydays

/**
  * Created by rayyildiz on 8/26/16.
  */
object Day10BinaryNumbers {

  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readInt()

    val r = Integer.toBinaryString(n)

    val s = r.split("0").map(_.length)
    println(s.max)
  }
}
