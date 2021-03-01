package G_matchStatements

object A_SimplePatternMatch {

  def main(args: Array[String]): Unit = {

    // You can pattern match on values of fields
    "hello" match {
      case "foo" => println("foo")
      case "bar" => println("bar")
      case "hello" => println("hello")
      case _ => println("this is default")
    }

  }

}

