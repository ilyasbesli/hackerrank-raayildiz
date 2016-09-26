package me.rayyildiz.hackerrank.thirtydays

/**
  * Created by rayyildiz on 8/19/16.
  */
object IntroConditionalStatements {
  private def printSitation(n: Int): String = {
    if (n % 2 != 0) "Weird"
    else {
      if (n >= 2 && n < 5) "Not Weird"
      else if (n >= 6 && n < 20) "Weird"
      else "Not Weird"
    }
  }

  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n  = sc.nextInt()
    sc.close()
    println(printSitation(n))

  }
}
