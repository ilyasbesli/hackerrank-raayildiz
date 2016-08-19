package me.rayyildiz.hackerrank.fp

/**
  * Created by rayyildiz on 8/18/16.
  */
object ListLength {

  def f(arr:List[Int]) : Int = arr.length

  def main(args: Array[String]): Unit = {

    val xs = Iterator.continually(scala.io.StdIn.readLine).takeWhile(_.nonEmpty)
      .map(_.toInt)
      .toList


    println(f(xs))
  }

}
