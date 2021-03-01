package E_curryingPartialFunctions

object CurriedStuff {


  def addSomeNumbers(i: Int)(j: Int)(k: Int) = i + j + k

  def main(args: Array[String]): Unit = {

    println(addSomeNumbers(1)(2)(3))


    val addOneAndTwoToSomeNumber: Int => Int = i => addSomeNumbers(1)(2)(i)

    println(addOneAndTwoToSomeNumber)
//
    println(addOneAndTwoToSomeNumber(3))
  }

}
