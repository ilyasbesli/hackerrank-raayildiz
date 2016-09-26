package me.rayyildiz.hackerrank.thirtydays

/**
  * Created by rayyildiz on 9/19/16.
  */
object Day28RegExPatternsAndIntroToDatabases {

  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readInt()

    val tmpNames = for (i <- 0 until n) yield scala.io.StdIn.readLine()

    val names = tmpNames.toList.map(c => c.split(" ")).map(c => (c(0), c(1)))

    val sorted = names.filter(_._2.endsWith("@gmail.com")).sortBy(_._1)

    sorted.foreach(x => println(x._1))

  }
}
