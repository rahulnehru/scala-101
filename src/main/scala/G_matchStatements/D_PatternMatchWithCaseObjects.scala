package G_matchStatements

case class Pet(name: String, age: Int, `type`: String)

object D_PatternMatchWithCaseObjects {

  def main(args: Array[String]): Unit = {

    val sparkyTheDog = Pet("sparky", 10, "dog")

    sparkyTheDog match {
      case Pet(name, age, "dog") if age > 10 => println(s"$name is a good old boy!")
      case Pet(name, age, "dog") => println(s"$name is a good young boy!")
      case Pet(_, _, "cat") => println(s"good little kitty")
    }

  }

}

