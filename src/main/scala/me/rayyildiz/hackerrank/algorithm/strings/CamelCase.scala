package me.rayyildiz.hackerrank.algorithm.strings

/**
  * Created by rayyildiz on 9/1/16.
  */
object CamelCase {

  def findCamelCaseWordCount(str: String): Int = {
    def acc(cur: Int, chars: Iterator[String]): Int = {
      cur
      /*
      if ( chars.isEmpty) cur
     else {

     }
     */
    }
    acc(1, str.tails)
  }

  def main(args: Array[String]): Unit = {
    // val lowerAlphabet = "abcdefghijklmnopqrstuvwxyz"
    // val jigherAlphabert = lowerAlphabet.toUpperCase
    val s = scala.io.StdIn.readLine()

    var count = 0
    for (ch <- s) {
      if (ch <= 'Z' && ch >= 'A') count = count + 1
    }

    if (s.length > 0) count = count + 1

    println(count)
  }
}
