package me.rayyildiz.hackerrank.fp

/**
  * Created by rayyildiz on 8/18/16.
  */
object UpdateList {

  def f(arr: List[Int]): List[Int] = arr.map(Math.abs(_))


  def main(args: Array[String]): Unit = {

    val xs = f(List(2, -4, 3, -1, 23, -4, -54))

    println(xs)
  }
}
