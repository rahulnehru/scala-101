package A_variables

object Variables {


  var a = "foo"
  val b = "bar"


  def main(args: Array[String]): Unit = {

    if(a == "boo") {
      println("boo")
    }

    a = "bat"

    println(s"a = $a")
    println(s"a = $b")
  }

}
