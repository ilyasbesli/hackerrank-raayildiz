package me.rayyildiz.hackerrank.fp

/**
  * Created by rayyildiz on 8/23/16.
  */
object StringMingling {

  def main(args: Array[String]): Unit = {
    val line1 = scala.io.StdIn.readLine()
    val line2 = scala.io.StdIn.readLine()

    val lineMingled = for(i<- 0 until line1.length)yield {
      s"${line1(i)}${line2(i)}"
    }


    println(lineMingled.mkString)
  }
}
