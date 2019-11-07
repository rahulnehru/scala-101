package B_methods

object Methods {

  def addOne(i: Int): Int = i + 1
  def addTwo(i: Int): Int = {i + 2}
  def addThree(i: Int) = i + 3
  def printSomething : Unit = println("Hello")
  def printWorld : Unit = if(true) print("world")

  def main(args: Array[String]): Unit = {
    printSomething

    printWorld
  }

}
