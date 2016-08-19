package me.rayyildiz.hackerrank.fp

/**
  * Created by rayyildiz on 8/19/16.
  */
object PascalsTriangle {

  private def pascal(c: Int, r: Int): Int = {
    def findAbove(currentRow: Int, currentColumn: Int): Int = {
      if (currentColumn == 0 || currentRow == 0 || currentColumn == currentRow)  1
      else findAbove(currentRow - 1, currentColumn - 1) + findAbove(currentRow - 1, currentColumn)
    }

    if (r > 0 && c > 0) {
      if (c == r)  1
      else  findAbove(r - 1, c - 1) + findAbove(r - 1, c)
    }else 1
  }

  def main(args: Array[String]): Unit = {
    val max = scala.io.StdIn.readInt()

    for (row <- 0 until max) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }
}
