package me.rayyildiz.hackerrank.HR101Hack40

/**
  * Created by rayyildiz on 8/29/16.
  */
object DesignerPDFViewer {

  def main(args: Array[String]): Unit = {
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    val line = scala.io.StdIn.readLine()
    val lengths = line.split(" ").map(_.toInt)

    val str = scala.io.StdIn.readLine()

    val strLengths = for(t <- str.indices) yield {
      val ch = alphabet.indexOf(str(t))
      lengths(ch)
    }


    println(strLengths.max * str.length *  1)

  }
}
