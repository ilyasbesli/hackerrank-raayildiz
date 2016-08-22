package me.rayyildiz.hackerrank.thirtydays

/**
  * Created by rayyildiz on 8/22/16.
  */
object Day5Loops {


  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readInt()

    for( i <- 1 to 10){
      println(s"${n} x ${i} = ${n*i}")
    }
  }
}
