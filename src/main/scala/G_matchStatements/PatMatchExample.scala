package G_matchStatements

object PatMatchExample {

  case class Person(name: String, age: Int)
  val john = Person("john", 12)
  val tommy = Person("tommy", 18)





  def authenticateValidUsers(p: Object, t: Person, shouldIdoSomething: Boolean) = {

    (p, t) match {
      case (Person("tommy", _), _) if shouldIdoSomething => 1
      case (Person(_, 12), _) => 2
      case ("jessica", Person("john", 12)) => 3
      case _ => throw new RuntimeException()
    }
  }






}
