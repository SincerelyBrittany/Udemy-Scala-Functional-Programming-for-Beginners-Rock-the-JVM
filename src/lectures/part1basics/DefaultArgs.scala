package lectures.part1basics

object DefaultArgs extends App{
//    def trFact(n: Int, acc: Int): Int ={
//      if(n <= 1) acc
//      else trFact(n-1, n*acc)
//    }

  def trFact(n: Int, acc: Int = 1): Int ={
    if(n <= 1) acc
    else trFact(n-1, n*acc)
  }

  val fact10 = trFact(10)
  //if I dnt pass in a parameter it will default to 1.

  // passing default args to parameters can cause issues


  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("saving picture")
  savePicture(width = 800)

  /*
    1. pass in every leading argument
    2. name the arguments
   */

  savePicture(height = 600, width = 800, format = "bmp")
}