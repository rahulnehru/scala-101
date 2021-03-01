package D_functions

object Functions {

  val addOne: Int => Int = i =>  i + 1

  val addTwo: Int => Int = _ + 2 // wildcard - syntactic sugar

  val addThree: (Int, Int) => Int = (i, j) => i + j + 3


  addTwo(addOne(1))


  def main(args: Array[String]): Unit = {

    addOne andThen addTwo apply(1)

    addTwo compose addOne apply(1)
  }

}
