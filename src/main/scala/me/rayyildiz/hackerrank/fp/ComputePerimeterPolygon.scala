package me.rayyildiz.hackerrank.fp

/**
  * Created by rayyildiz on 8/19/16.
  */
object ComputePerimeterPolygon {

  def main(args: Array[String]): Unit = {
    class Point(val x: Int, val y: Int) {
      def distanceFrom(other: Point): Double = {
        val a = x - other.x
        val b = y - other.y
        math.sqrt(a * a + b * b)
      }
    }

    val tests = scala.io.StdIn.readInt()

    val lines = Iterator.continually(scala.io.StdIn.readLine()).take(tests)
    // scala.io.Source.stdin.getLines().toList
    val parts = lines.partition(!_.contains(" "))
    val pairs = parts._2.map(_.split(" ")).map(arr => Tuple2(arr(0).toInt, arr(1).toInt))

    val xxs = for {
      cor <- pairs
    } yield {
      new Point(cor._1, cor._2)
    }

    val xs = xxs.toList

    val res = for (i <- 0 until xs.length) yield {
      val p    = xs(i)
      val next = if (i == xs.length - 1) xs(0) else xs(i + 1)

      p.distanceFrom(next)
    }

    println(res.sum)

  }
}
