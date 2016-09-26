package me.rayyildiz.hackerrank.fp

/**
  * Created by rayyildiz on 8/19/16.
  */
object FunctionsFractalsSierpinskiTriangles {
  private def drawTriangles(n: Int) {
    def one(n: Int)          = if ((n & 1L) == 1L) "1" else "_"
    def ones(n: Int): String = if (n == 0L) "_" else one(n) + "_" + ones(n >> 1)
    def underline(n: Int)    = "_" * n
    ((1 << 10) - 1 to 0 by -1).foldLeft(1) {
      case (bitmap, remainingLines) =>
        println(underline(remainingLines) + ones(bitmap) + underline(remainingLines))
        (bitmap << 1) ^ bitmap
    }
  }

  def main(args: Array[String]): Unit = {
    val c = scala.io.StdIn.readInt()

    drawTriangles(c)
  }
}
