package me.rayyildiz.hackerrank.algorithm.arrays

object TwoArrayDS {

  def main(args: Array[String]): Unit = {

    // TODO delete it , it just a test code
    val tmp = """1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0""".stripMargin

    val square = for (i <- 0 until 6) yield (scala.io.StdIn.readLine().split(" ").take(6)).map(_.toInt).toList

    // val square = tmp.split("\n").take(6).map(x => x.split(" ").take(6).map(y => y.toInt))

    /*
    square.foreach(x=> {
      x.foreach(y => print(y + " "))
      println("")
    })
     */

    val listOfSum = for (i <- 1 until 5;
                         j <- 1 until 5) yield {
      square(i - 1)(j - 1) + square(i - 1)(j) + square(i - 1)(j + 1) +
        square(i)(j) +
        square(i + 1)(j - 1) + square(i + 1)(j) + square(i + 1)(j + 1)
    }

    println(listOfSum.max)
    // println(square)
  }

}
