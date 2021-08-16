package B_methods_and_logical_controls

object A_Methods {

  def addOne(i: Int): Int = i + 1

  def addTwo(i: Int): Int = {i + 2}

  def addThree(i: Int): Int = i + 3

  def printSomething : Unit = println("Hello")
  def printWorld : Unit = if(true) print("world")

  def main(args: Array[String]): Unit = {
    printSomething

    printWorld
  }

}

