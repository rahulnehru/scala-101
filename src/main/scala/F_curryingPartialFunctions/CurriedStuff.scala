package F_curryingPartialFunctions

object CurriedStuff {


  def addSomeNumbers(i: Int)(j: Int)(k: Int) = i + j + k

  def main(args: Array[String]): Unit = {

    println(addSomeNumbers(1)(2)(3))


    val addOneAndTwoToSomeNumber: Int => Int = addSomeNumbers(1)(2)

    println(addOneAndTwoToSomeNumber(3))
  }

}
