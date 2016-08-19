package me.rayyildiz.hackerrank.fp

/**
  * Created by rayyildiz on 8/19/16.
  */
object FibonacciNumbers {
  private def findFibonanciNumbers(n:Int,nth:Int, xs:List[Int]):List[Int] = {
    if ( xs.isEmpty) List()
    else if (nth > n) {
      val next = xs.head + xs.tail.head

      findFibonanciNumbers(n + 1,nth,next::xs )
    }else {
      xs
    }
  }

  def findFibonancyNumber(n:Int):Int = {
    findFibonanciNumbers(3,n,List(1,1)).head
  }

  def main(args: Array[String]): Unit = {
    val no = scala.io.StdIn.readInt()

    println(findFibonancyNumber(no))

  }
}
