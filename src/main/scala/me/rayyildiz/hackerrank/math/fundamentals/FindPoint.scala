package me.rayyildiz.hackerrank.math.fundamentals

/**
  * Created by rayyildiz on 9/1/16.
  */
object FindPoint {

  def main(args: Array[String]): Unit = {
    val c = scala.io.StdIn.readInt()

    val numbers = for (i <- 0 until c) yield scala.io.StdIn.readLine().split(" ").map(_.toInt)

    val result = for (num <- numbers) yield {
      val diff1 = num(2) - num(0)
      val diff2 = num(3) - num(1)

      (num(2) + diff1, num(3) + diff2)
    }

    result.foreach(x => println(x._1 + " " + x._2))
  }
}
