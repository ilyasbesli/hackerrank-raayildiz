package me.rayyildiz.hackerrank.euler

object Euler1 {
  def main(args: Array[String]): Unit = {

    val count = scala.io.StdIn.readInt()

    val xs  = for (i <- 1 to count) yield scala.io.StdIn.readInt()
    val max = xs.max

    val allList = List.range(1, max).filter(x => x % 3 == 0 || x % 5 == 0)

    for (x <- xs) {
      val sum = allList.filter(d => d < x).foldLeft(0)(_ + _)
      println(sum)
    }
  }
}
