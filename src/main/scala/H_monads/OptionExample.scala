package H_monads




object OptionExample {


  def main(args: Array[String]): Unit = {

    val optionOfANumber: Option[Int] = List(1,2,3).find(_ == 2)

    println(optionOfANumber.map(_  + 50000))

  }

}


