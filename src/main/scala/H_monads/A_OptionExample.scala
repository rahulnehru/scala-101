package H_monads


/*
 What problems do we encounter in Java?
            null

 We want to eradicate the problem...
 if(x != null) {
    ...
 } else {
    ...
 }
*/

object A_OptionExample {


  // Option is a Monad... it is an abstraction which removes the need for boilerplate code
  // it handles all the instances where something might be null and lets you focus on writing business logic
  // it is a functor with some structure, and it achieves this by using the Option type


  def main(args: Array[String]): Unit = {

    val something: Option[String] = Option.apply("something")
    val notSomething: Option[String] = Option.empty

    println(s"something = ${something.get}")
    println(s"notSomething = ${notSomething.get}")

    val emptyList: List[Int] = List.empty
    println(s"head of my empty list, plus one, is ${emptyList.headOption.map(_ + 1)}")

    println(s"something isDefined = ${something.isDefined}")
    println(s"something isEmpty = ${something.isEmpty}")

    println(s"notSomething isDefined = ${notSomething.isDefined}")
    println(s"notSomething isEmpty = ${notSomething.isEmpty}")

    println(s"something contains an s = ${something.exists(_.contains("s"))}")
    println(s"notSomething contains an s = ${notSomething.exists(_.contains("s"))}")

    // There are two modes of an Option when evalutating... Some(x) and None
  }

}


