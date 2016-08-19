package me.rayyildiz.hackerrank.algorithm

/**
  * Created by rayyildiz on 8/19/16.
  */
object SimpleArraySum {

  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner (System.in)

    val count = scala.io.StdIn.readInt()
    val xs = io.Source.stdin.getLines().take(1).mkString.split(" ").map(_.toInt).take(count)

   //  val xs = for( i <- 1 to count) yield scala.io.StdIn.readInt()

    sc.close()

    println(xs.sum)
  }
}
