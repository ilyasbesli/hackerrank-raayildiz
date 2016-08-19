package me.rayyildiz.hackerrank.fp

/**
  * Created by rayyildiz on 8/18/16.
  */
object FilterArray {

  def f(delim:Int,arr:List[Int]):List[Int] = arr.filter(_ < delim)



  def main(args: Array[String]): Unit = {
    val xs = f(3,List.range(0,10,1))

    println(xs)
  }

}
