package me.rayyildiz.hackerrank.fp

/**
  * Created by rayyildiz on 8/18/16.
  */
object SumOddElements {
  def f(arr: List[Int]): Int = arr.filter(_%2!=0).sum


  def main(args: Array[String]): Unit = {
    val x = f(List(3, 2, 4, 6, 5, 7, 8, 0, 1))

    println(x)
  }

}
