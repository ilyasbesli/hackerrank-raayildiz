package me.rayyildiz.hackerrank.fp

/**
  * Created by rayyildiz on 8/19/16.
  */
object ComputeAreaPolygon {


  def main(args: Array[String]): Unit = {
    case class Point(x:Int, y:Int)


    val tests = scala.io.StdIn.readInt()

    val lines = Iterator.continually(scala.io.StdIn.readLine()).take(tests)
    val parts = lines.partition(!_.contains(" "))
    val pairs = parts._2.map(_.split(" ")).map(arr => Tuple2(arr(0).toInt, arr(1).toInt))

    val xxs = for{
      cor <- pairs
    } yield {
      Point(cor._1,cor._2)
    }

    val xs = xxs.toList

    val maxX = xs.map(_.x).max - xs.map(_.x).min
    val maxY = xs.map(_.y).max - xs.map(_.y).min

    if ( xs.length < 3 ) println(1)
    else {
      val totalArea:Int = maxX * maxY

      val res = for(i<- 0 until xs.length) yield{
        val p = xs(i)
        val next = if ( i == xs.length - 1) xs(0) else xs(i+1)

        Math.abs(p.x - next.x) * Math.abs(p.y - next.y)
      }


      val r = totalArea.toDouble - res.sum / 2

      println(r)
    }
  }

}
