package me.rayyildiz.hackerrank.fp

/**
  * Created by rayyildiz on 8/23/16.
  */
object StringOPermute {

  def main(args: Array[String]): Unit = {
    val t = scala.io.StdIn.readInt()

    val lines = for (i <- 0 until t) yield scala.io.StdIn.readLine()

    val permuted = for (line <- lines) yield {
      val aa = for (j <- 0 until(line.length - 1,2))yield {
        s"${line(j+1)}${line(j)}"
      }

      aa.mkString
    }

    for(p<- permuted) {
      println(p)
    }
  }
}
