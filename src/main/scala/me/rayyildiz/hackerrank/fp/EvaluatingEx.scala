package me.rayyildiz.hackerrank.fp

/**
  * Created by rayyildiz on 8/18/16.
  */
object EvaluatingEx {

  def fact(i: Int): Int = {
    if (i < 1) 1
    else fact(i - 1) * i
  }

  def f(x: Float): Float = {
    // Compute and Return the value of e^x

    def acc(i: Int, res: Float): Float = {
      if (i > 9) res
      else {
        val m = Math.pow(x, i)
        val f = fact(i)
        val r = m.toFloat / f

//        println(s"i:${i}, x:${x} m:${m} f:${f} r:${r}" )
        acc(i + 1, res + r)
      }
    }

    acc(0, 0)
  }

  def main(args: Array[String]): Unit = {
    val xs = List(20.0000f, 5.0000f, 0.5000f, -0.5000f)
    for (x <- xs) {
      println(s"result[${x}]: ${f(x)}")
    }
  }
}
