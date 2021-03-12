package lectures.part1basics

object Expressions extends App {
  //Mathematical expressions

  val x = 1 + 2
  // 1+ 2 is an expression

  println(2 + 3 * 4)

  // + - * / & | ^ << >> >>> (right shift with zero extension)

  //relational expressions:
  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ..... side effects meaning that they only work with a variable
  println(aVariable)

  // Instructions versus expressions



}
