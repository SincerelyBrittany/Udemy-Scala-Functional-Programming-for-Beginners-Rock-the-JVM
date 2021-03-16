package lectures.part1basics

object Functions extends App{

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello", 3))

  def aParameterLessFunction(): Int = 42

  println(aParameterLessFunction())
  println(aParameterLessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if(n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 3))

  //In a regular programming languageyou would lose loops, but in scala when you need loops use recursions
  //Use functional programming


// 1. A greeting function that takes in a name and an age
  // Greeting should say "hi, my name is $name and my age is $age

  def greetingFunction(name: String, age: Int): String= {
   "hi my name is " + name + "& my age is " + age
  }

  println(greetingFunction("brittany", 25))

  def factorialFunction(num: Int): Int ={
    if(num <= 0) 1
    else num * factorialFunction(num-1)
  }

  println(factorialFunction(5))

  def factorial(n: Int): Int =
    if (n <= 0) {
      1
    }
    else {
      n * factorial(n-1)
    }

  println(factorial(5))


  // A fibonacci function
     //f(10 = 1

  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)

  // 1 1 2 3 5 8 13 21
  println(fibonacci(8))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }
  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))

}
