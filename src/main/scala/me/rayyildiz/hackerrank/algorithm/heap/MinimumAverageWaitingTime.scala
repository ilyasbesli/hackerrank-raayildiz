package me.rayyildiz.hackerrank.algorithm.heap

object MinimumAverageWaitingTime {
  case class Customer(time: Long, cookingTime: Long)

  object AvgTime {

    /**
      *  find minimum average time for list of customer
      */
    def findMinimumAvarageTime(customers: List[Customer]): Long = {
      // Lets create a Max-Heap
      val queue = new scala.collection.mutable.PriorityQueue[Customer]()(new Ordering[Customer] {
        def compare(c1: Customer, c2: Customer): Int = {
          (c2.cookingTime) compare (c1.cookingTime)
        }
      })

      // Use ArrayBuffer
      // Because scala has bug with List ( if size is less than 5)
      val mutableCustomers = scala.collection.mutable.ArrayBuffer.empty[Customer]
      for (c <- customers) {
        mutableCustomers += c
      }

      // Lets sort the customers with entry time
      val sortedCustomerList = mutableCustomers.sortWith((c1, c2) => c1.time < c2.time)

      val total   = new java.util.concurrent.atomic.AtomicLong(0)
      val current = new java.util.concurrent.atomic.AtomicLong(0)

      while (queue.nonEmpty || sortedCustomerList.nonEmpty) {

        val tmp = current.get()

        while (sortedCustomerList.nonEmpty && (queue.isEmpty || sortedCustomerList.head.time <= tmp)) {
          val cust = sortedCustomerList.head
          sortedCustomerList -= cust
          queue.enqueue(cust)

          current.set(Math.max(tmp, cust.time))
        }

        val cust       = queue.dequeue()
        val currentTmp = current.get() + cust.cookingTime
        val totalTmp   = total.get() + currentTmp - cust.time

        total.set(totalTmp)
        current.set(currentTmp)
      }

      if (customers.size < 1) {
        0L
      } else {
        total.get() / customers.size
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val c = scala.io.StdIn.readInt()

    val customers = for (i <- 0 until c) yield {
      val line = scala.io.StdIn.readLine()

      val parts = line.split(" ").take(2)

      Customer(time = parts(0).toLong, cookingTime = parts(1).toLong)
    }

    val min = AvgTime.findMinimumAvarageTime(customers.toList)

    println(min)
  }

}
