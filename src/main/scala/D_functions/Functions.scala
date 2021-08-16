package D_functions

object Functions {

  val addOne: Int => Int = i =>  i + 1

  val addTwo: Int => Int = _ + 2 // wildcard - syntactic sugar

  val addThree: (Int, Int) => Int = (i, j) => i + j + 3




  def main(args: Array[String]): Unit = {
    addTwo(addOne(1))
  }

}
