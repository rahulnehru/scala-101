package D_functions

object Functions {

  val addOne: Int => Int = i =>  i + 1

  val addTwo: Int => Int = _ + 2



  addTwo(addOne(1))


  def main(args: Array[String]): Unit = {


    println(addTwo(addOne(1)))


  }

}
