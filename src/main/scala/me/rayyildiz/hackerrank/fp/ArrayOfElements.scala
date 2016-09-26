package me.rayyildiz.hackerrank.fp

/**
  * Created by rayyildiz on 8/18/16.
  */
object ArrayOfElements {
  def f(num: Int): List[Int] = List.range(1, num + 1)

  def main(args: Array[String]): Unit = {
    val xs = f(4)

    println(xs)
  }
}
