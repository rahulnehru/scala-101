package B_methods_and_logical_controls

object A_Methods {

//  Typically a lot of code and boilerplate in Java
//  public String convertAllAsToStars(String input) {
//    return input.replaceAll("a", "*");
//  }

  def addOne(i: Int): Int = i + 1

  def addTwo(i: Int): Int = {i + 2}

  def addThree(i: Int): Int = i + 3

  private def printSomething= println("Hello")
  def printWorld : Unit = if(true) print("world")

  def main(args: Array[String]): Unit = {
    printSomething

    printWorld
  }

}

