package part2oop

object Notations extends App{

  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie //this person likes the movie if the movie equals favorite movie
    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
  }

  val mary = new Person("Mary", "Scary movie")
  println(mary.likes("Scary movie"))
  println(mary likes "Scary movie") //infix notation or operator notation - only works with methods that only have one parameter
  println(mary.likes("Grinch"))

  // "operators" in Scala
  val tom = new Person("Tom", "fight club")
  println(mary hangOutWith tom)
  //Use the term operator earlier beucase in this case the method hang out acts like an operator which yields a string
  //the term operator (+, -, *, /)
  // it is calling the method +
  println(mary + tom)
  //you can name your methods what you want/ words are not reserved

  println(mary.+(tom))

  // the mathematical operators in scala are actually acting in the exact same way as mthods because they are methods 


}
