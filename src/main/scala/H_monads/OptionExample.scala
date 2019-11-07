package H_monads

import scala.util.Try

object OptionExample {


  def main(args: Array[String]): Unit = {

    val optionOfANumber: Option[Int] = List(1,2,3).find(_ == 2)

    println(optionOfANumber.map(_  + 50000))

  }


}


object TryExample {


  def main(args: Array[String]): Unit = {

    val optionOfANumber: Option[Int] = List(1, 2, 3).find(_ == 2)

    Try(optionOfANumber.get).getOrElse(2)

  }

}
