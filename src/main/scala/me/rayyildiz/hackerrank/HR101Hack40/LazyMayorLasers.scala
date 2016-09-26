package me.rayyildiz.hackerrank.HR101Hack40

/**
  * Created by rayyildiz on 8/29/16.
  */
object LazyMayorLasers {

  def main(args: Array[String]): Unit = {
    val buildCount = scala.io.StdIn.readInt()
    val buildings  = for (i <- 0 until (buildCount)) yield scala.io.StdIn.readInt()
    val laserCount = scala.io.StdIn.readInt()
    val lasers     = for (i <- 0 until laserCount) yield scala.io.StdIn.readInt()

    val r = for (laser <- lasers) yield {}
  }
}
