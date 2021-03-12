package lectures.part1basics

object ValuesVariablesTypes extends App{
      //syntax = val, name, colon, type
      val x: Int = 42
      println(x)

      // val can not be changed, like constants in java, immutable, cant change x = 2

      val y = 42

      //the types are optional, dont have to specify the type, compiler can infer types

      val aString: String = "hello world"

      //SEMI COLONS ARE NOT REQUIRED UNLESS THEIR ARE MULTIPLE EXPRESSIONS ON THE SAME LINE, WHICH IS NOT BEST PRACTICE.

      val aBoolean: Boolean = false

      val aChar: Char = 'a'
      //make sure to use single quotations for char

      val anInt: Int = x

      val aShort: Short = 4613
      // two bytes only, the compiler will complain if the short is too long

      val aLong: Long = 5273985273895237L
      //eight bytes only - add a capital L at the end to indicate it is a Long

      val aFloat: Float = 2.0f
      // without the f the compiler will think the number is a double and not a float

      val aDouble: Double = 3.14


      //variables

      var aVariable: Int = 4

      // a variable can be reassigned

      aVariable = 6




}
