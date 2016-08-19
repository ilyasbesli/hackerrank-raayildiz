package me.rayyildiz.hackerrank.fp

/**
  * Created by rayyildiz on 8/19/16.
  */
object ComputingGCD {

  def gcd(x: Int, y: Int): Int = if(y==0) x else gcd(y, x%y)

  def acceptInputAndComputeGCD(pair:List[Int]) = {
    println(gcd(pair.head,pair.reverse.head))
  }
  def main(args: Array[String]): Unit = {
    acceptInputAndComputeGCD(scala.io.StdIn.readLine().trim().split(" ").map(_.toInt).toList)
  }
}
