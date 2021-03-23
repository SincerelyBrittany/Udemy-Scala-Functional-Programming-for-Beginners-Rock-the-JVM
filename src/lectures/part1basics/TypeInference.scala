package lectures.part1basics

object TypeInference {
  //What the compiler knows
  //when we dont specify a typefor a value or variable the compiler will try to figure it out for us.

  //example - compiler looks at right side and sees "hello world" and says okay message must be a string
  val message = "Hello World"

  //then it infers the type and write a complete value definition in the background. Example:
  //val message: String = "Hello World"

  //The compiler is also able to figure out the return type of funcitions by looking at their implementations

  def succ(x: Int) = x+ 1

  //dont try to fool it

  //def aString(x: Int) = "Hello World"


  def factorial(n: Int): Int =
    if (n <= 0) {
      1
    }
    else {
      n * factorial(n-1)
    }
}
