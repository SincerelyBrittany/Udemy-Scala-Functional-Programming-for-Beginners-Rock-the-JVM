package lectures.part1basics

object CBNvCBV {
    def calledByValue(x: Long): Unit = {
      println("by value: " + x)
      println("by value: " + x)
    }

  // => the arrow tells the compiler that the parameter will be called by name
  //this is a different evaluating parameter in functions
  def calledByName(x: => Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }


  //example
  //System.nanoTime() - tells the systems current time in nanoseconds
  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())
}
