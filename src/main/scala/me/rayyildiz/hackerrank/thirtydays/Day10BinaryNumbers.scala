package me.rayyildiz.hackerrank.thirtydays

/**
  * Created by rayyildiz on 8/26/16.
  */
object Day10BinaryNumbers {

  def main(args: Array[String]): Unit = {
    println(Integer.toBinaryString(scala.io.StdIn.readInt()).split("0").map(_.length).max)
  }
}
