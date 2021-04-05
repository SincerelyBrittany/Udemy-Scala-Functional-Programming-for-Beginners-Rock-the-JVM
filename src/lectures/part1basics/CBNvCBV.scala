package lectures.part1basics

object CBNvsCBV extends App {

//  def calledByValue(x: Long): Unit = {
    //      println("by value: " + x)
    //      println("by value: " + x)
    //    }

  def calledByValue(x: Long): Unit = {
    println("by value: " + 1257387745764245L)
    println("by value: " + 1257387745764245L)
  }

  // => the arrow tells the compiler that the parameter will be called by name
  // this is a different evaluating parameter in functions

  def calledByName(x: => Long): Unit = {
    //System.nanoTime() - tells the systems current time in nanoseconds
    println("by name: " + System.nanoTime())
    println("by name: " + System.nanoTime())
  }

  calledByValue(1257387745764245L)
  calledByName(System.nanoTime())

  //  //nano secnds are usually long
  //  //the arrow makes all the difference in the world--it explains the two different values for calledbyName
  //in the byValue function the exact value of the expression is computed before the function evaluates
  //the computer evalautes Sysyem.nanoTime() first and then keepsit that way for the function

    //by contraster, the expression is passed literally asis and is evaluated every time

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  //  printFirst(infinite(), 34)
  printFirst(34, infinite())
}
