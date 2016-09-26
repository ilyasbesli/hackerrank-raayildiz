package me.rayyildiz.hackerrank.algorithm

/**
  * Created by rayyildiz on 8/19/16.
  */
object CompareTriplets {

  def main(args: Array[String]): Unit = {
    val sc    = new java.util.Scanner(System.in)
    val aList = io.Source.stdin.getLines().take(1).mkString.split(" ").filter(_.isInstanceOf[Int]).map(_.toInt)
    val bList = io.Source.stdin.getLines().take(1).mkString.split(" ").filter(_.isInstanceOf[Int]).map(_.toInt)
    sc.close()

    val xs = for (i <- aList.indices) yield {
      val a = aList(i)
      val b = bList(i)

      if (a == b) ""
      else "1 "
    }

    println(xs.mkString(""))
  }
}
