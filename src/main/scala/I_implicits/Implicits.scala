package I_implicits

object Implicits {


  def main(args: Array[String]): Unit = {
    
    implicit val stringToPrint = "hello"

    val t = addThreeToANumber(addTwoToANumber(addOneToANumber(1)))


  }



  def addOneToANumber(i: Int)(implicit strToPrint: String) = {
    println(strToPrint)
    i + 1
  }

  def addTwoToANumber(i: Int)(implicit strToPrint: String) = {
    println(strToPrint)
    i + 2
  }

  def addThreeToANumber(i: Int)(implicit strToPrint: String) = {
    println(strToPrint)
    i + 3
  }


}
