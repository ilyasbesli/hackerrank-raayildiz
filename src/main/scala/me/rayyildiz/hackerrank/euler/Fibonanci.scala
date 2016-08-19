package me.rayyildiz.hackerrank.euler

/**
  * Created by rayyildiz on 8/19/16.
  */
object Fibonanci {

  private def findFibonanciNumbers(n:Int, xs:List[Int]):List[Int] = {
    if ( xs.isEmpty) List()
    else if (xs.head < n) {
      val next = xs.head + xs.tail.head

      findFibonanciNumbers(n,next::xs )
    }else {
      xs
    }
  }

  def main(args: Array[String]): Unit = {
    val count = scala.io.StdIn.readInt()

    val xs = for( i <- 1 to count) yield scala.io.StdIn.readInt()

    for (x <- xs) {
      val f = findFibonanciNumbers(x,List(1,1)).filter(_%2 == 0)
      println(f)
    }

  }
}
