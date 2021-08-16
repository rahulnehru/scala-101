package B_methods_and_logical_controls

import scala.util.Random

object B_IfStatements {

  val randomNumber = Random.nextInt()

  def main(args: Array[String]): Unit = {

    if(randomNumber % 2 == 0) {
      println("Hello")
    } else {
      println("Goodbye")
    }

    if (randomNumber % 2 == 0)
      println("World")
    else if (randomNumber == 0)
      println("Darlings")
    else println("Everyone")
  }

}
