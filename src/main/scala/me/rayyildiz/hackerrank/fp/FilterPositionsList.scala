package me.rayyildiz.hackerrank.fp

/**
  * Created by rayyildiz on 8/18/16.
  */
object FilterPositionsList {

  def f(arr:List[Int]):List[Int] = {
    val res = for {
      i <- arr.indices if ( i % 2 != 0)
    } yield arr(i)

    res.toList
  }

  def main(args: Array[String]): Unit = {

    val xs = f(List(2, 5,3, 4, 6, 7, 9,8))

    println(xs)
  }
}
