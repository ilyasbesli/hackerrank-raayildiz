package me.rayyildiz.hackerrank.thirtydays

/**
  * Created by rayyildiz on 8/25/16.
  */
object Day9Recursion {

  private def factorial(n:Int):Int = {
    @scala.annotation.tailrec
    def factAcc(r:Int, x:Int):Int = {
      if ( x < 2) r
      else factAcc( x*r,x-1)
    }

    factAcc(1,n)
  }

  def main(args: Array[String]): Unit = {
    val r = scala.io.StdIn.readInt()

    println(factorial(r))

  }
}
