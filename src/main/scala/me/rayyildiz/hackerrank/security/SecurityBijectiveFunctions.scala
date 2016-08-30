package me.rayyildiz.hackerrank.security

/**
  * Created by rayyildiz on 8/30/16.
  */
object SecurityBijectiveFunctions {

  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readInt()
    val line = scala.io.StdIn.readLine()
    val numbers = line.split(" ").take(n).map(_.toInt)


    val x = numbers.groupBy(x => x).map(t => (t._1, t._2.length))
    val list = x.filter(_._2>1)

    if ( list.size>0)println("NO")
    else println("YES")


    println(list)
  }
}
