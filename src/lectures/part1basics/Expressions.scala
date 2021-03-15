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

  var i = 0
  while (i < 10){
    println(i)
    i += 1
  }

  // NEVER WRITE THIS AGAIN - DONT WRITE IMPERATIVE CODE

  //EVERYTHING IN SCALA IS AN EXPRESSION

  val aWeirdValue = (aVariable = 3) // UnIt === Void
  println(aWeirdValue)
  //SIDE EFFECTS IN SCALA ARE ACTUALLY EXPRESSIONS RETURNING UNIT
  //UNIT === ()
  // EXAMPLES OF SIDE EFFECTS : println(), whiles, reassigning

  //CODE BLOCKs

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  //codeblock is an expression
  //the value of the block is the value of the last expression

  //val anotherValue = z + 1 // z is inside a codeblock and not available outside.

  // // 1. difference between "hello world" vs println("hello world")?

  //HELLO WORLD IS A LITERAL STRING - A VALUE OF TYPE: STRING. THE PRINTLN AN EXPRESSION WHICH IS A SIDE EFFECT WHICH IS RETURNING UNIT
  // HAS THE SIDE EFFECT OF PRINTING HELLO WORLD TO THE VALUE

  // 2.

    val someValue = {
      2 < 3
    }
    println(someValue)

  // RETURNS A BOOLEAN

    val someOtherValue = {
      if(someValue) 239 else 986
      42
    }
    println(someOtherValue)

  // THE VALUE IS 42

}
