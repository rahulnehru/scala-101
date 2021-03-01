package G_matchStatements

object B_SimplePatternMatchWithIfs {

  def main(args: Array[String]): Unit = {

    var x = 1

    // You can pattern match on values of fields you can add if statements
    "hello" match {
      case "foo" => println("foo")
      case "bar" => println("bar")
      case "hello" if x % 2 == 0 =>
        x+=1
        println("hello")
      case "hello" => println("world")
      case _ => println("this is default")
    }

  }

}

