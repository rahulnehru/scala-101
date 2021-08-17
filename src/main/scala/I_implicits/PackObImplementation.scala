package I_implicits

class PackObImplementation {


  val b: Boolean = false

  def longToString(l: Long): String = {
    l.toString
  }

  def main(args: Array[String]): Unit = {
    longToString(I_implicits.booleanToLong(b))
  }

}
