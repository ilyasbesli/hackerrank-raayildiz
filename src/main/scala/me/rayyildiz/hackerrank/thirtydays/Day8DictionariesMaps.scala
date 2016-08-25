package me.rayyildiz.hackerrank.thirtydays

/**
  * Created by rayyildiz on 8/25/16.
  */
object Day8DictionariesMaps {

  def main(args: Array[String]): Unit = {
    val t = scala.io.StdIn.readInt()


    val numbersTemp = for (i <- 0 until t) yield{
      val line = scala.io.StdIn.readLine()

      val parts = line.split(" ")

      parts(0)->parts(1)
    }

    val numbers = numbersTemp.toMap

    val names  =  Iterator.continually(scala.io.StdIn.readLine).takeWhile(_.nonEmpty).map(_.toString)

    for(name <- names) {
      if ( numbers.contains(name)) println(s"${name}=${numbers(name)}")
      else println("Not found")
    }

  }
}
