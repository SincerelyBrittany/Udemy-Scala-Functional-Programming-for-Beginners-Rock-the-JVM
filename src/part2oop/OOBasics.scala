package part2oop

object OOBasics extends App{


  //instantiate a class by writing "new" Person
  //on every new instantiate of person/ any class - the entire block is run.
  val person = new Person("John", 26)
  println(person)
  person.greet("daniel")
  person.greeting()

  //how do you access name and age?
  //dot notation will not work (person.age)
  //because name and age is a class parameter but not a class member that you an access with dot notation

  //class parameters are not fields!

  val car = new Car("Subaru", 1993, "legacy")
  println(car.model)
  println(car.x)

  val writer = new Writer("Sincerely", "Brittany", 20)
//   println(writer.fullname())
  writer.fullname()

}


//Class can sit on top level code
//A Class is like an object constructor, or a "blueprint" for creating objects.
//A class organizes data and behavior that is code


//instantiation means concrete realization and memory that is actual memory speaces that conform to the code
//and the data structure that the class describes.

/*
To instantiate is to create such an instance by, for example, defining one particular variation of
object within a class, giving it a name, and locating it in some physical place. 1) In object-oriented programming,
some writers say that you instantiate a class to create an object, a concrete instance of the class.
 */

//pass parameters into a class
class Person(name: String, age: Int = 0) {// constructor - says that every single instance of person must be constructed by passing in a name and the age
  def greet(name: String): Unit = println(s"${this.name} says: hello $name")
  def greeting(): Unit = println(s"${this.name} says: hello $name")

  //Overloading - methods with same name but different signatures = different number of parameters
  def greet(): Unit = println("Hello world")

}
//in order to make class parameter *name and string into a class field you have to add the vowerl or var keyword




class Car(val model: String, val year: Int, carType: String){
  //body - implementation of class
  val x = 3; // this is a field
  println(1 + 3)

  //multiple constructors - i wouuldnt work

//  def this(model:String) = this(model, 1993, carType)
}

/*
  Novel and a Writer
  Writer: first name, surname, year
    - method fullname
  Novel: name, year of release, author
  - authorAge - returns age of author at year of release
  - isWrittenBy(author)
  - copy (new year of release) = new instance of Novel
 */

class Writer(val firstName: String, val lastName: String, val yearOfBirth: Int){
  def fullname(): Unit = println(s"${this.firstName} ${this.lastName} ")
}

class Novel(name: String, yearOfRelease: Int, author: Writer){
  def authorAge(): Int = (author.yearOfBirth - this.yearOfRelease)
//  def isWrittenBy(): Unit = println(author.fullname())
  def isWrittenBy(author: Writer)= author == this.author
   def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

/*
  Counter class
    - receives an int value
    - method current count
    - method to increment/decrement => new Counter
    - overload inc/dec to receive an amount
 */

//class Counter(val count: Int){
////  def currentCount(): Unit = println(this.count)
//
//  def increase = new Counter(count + 1)//immutablility
//  def decrease = new Counter(count - 1)
//
//  def increment(n : Int) = new Counter(count + n)
//  def decrement(n : Int) = new Counter(count - n)
//
//}

class Counter(val count: Int = 0) {
  def inc = {
    println("incrementing")
    new Counter(count + 1)  // immutability
  }

  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n-1)
  }

  def dec(n: Int): Counter =
    if (n <= 0) this
    else dec.dec(n-1)

  def print = println(count)
}

