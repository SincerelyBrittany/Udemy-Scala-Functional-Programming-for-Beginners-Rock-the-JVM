package part2oop

object OOBasics extends App{


  //instantiate a class by writing "new" Person
  //on every new instantiate of person/ any class - the entire block is run. 
  val person = new Person("John", 26)
  println(person)

  //how do you access name and age?
  //dot notation will not work (person.age)
  //because name and age is a class parameter but not a class member that you an access with dot notation

  //class parameters are not fields!

  val car = new Car("Subaru", 1993, "legacy")
  println(car.model)
  println(car.x)

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
class Person(name: String, age: Int) // constructor - says that every single instance of person must be constructed by passing in a name and the age

//in order to make class parameter *name and string into a class field you have to add the vowerl or var keyword


class Car(val model: String, val year: Int, carType: String){
  //body - implementation of class
  val x = 3; // this is a field
  println(1 + 3)

}


