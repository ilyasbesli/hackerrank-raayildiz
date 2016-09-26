package me.rayyildiz.hackerrank.fp

/**
  * Created by rayyildiz on 8/23/16.
  */
object StringCompression {

  def main(args: Array[String]): Unit = {
    val line = scala.io.StdIn.readLine()

    def acc(nextChar: Char, nextLength: Int, compressed: String, tail: List[Char]): String = {
      if (tail.isEmpty) compressed
      else {
        if (tail.head == nextChar) acc(nextChar, nextLength + 1, compressed, tail.tail)
        else compressed
      }
    }

    /* val res = for ( i<-0 until line.length) yield {

    } */
  }
}
