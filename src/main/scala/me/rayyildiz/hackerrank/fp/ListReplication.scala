package me.rayyildiz.hackerrank.fp

object ListReplication {
  def f(num: Int, arr: List[Int]): List[Int] = arr.map(x => List.fill(num)(x)).flatten

  def main(args: Array[String]): Unit = {
    println(f(3, List(1, 2, 3, 4)))
  }

}
