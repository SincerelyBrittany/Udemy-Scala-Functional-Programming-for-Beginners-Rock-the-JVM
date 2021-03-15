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
  // Instructions something that you tell the computer to do -- example change a varaible, print to the console, do this, do that , compute this etc. . .
  //an expressions is something that has a value and/or type == will comput a value

  // IF expression
  val aCondition = true
  //  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION
  val aConditionedValue = if(aCondition) {
    5
  } else{
    3
  }
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)
  println(1 + 3)


}
