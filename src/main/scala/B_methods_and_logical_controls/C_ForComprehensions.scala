package B_methods_and_logical_controls

object C_ForComprehensions {

//  Typically some boilerplate in Java
//  for (int i = 0; i<100; i++) {
//
//  }

  def simpleForLoop = {
    println("------ simple ------")
    println("Using to")
    for(i <- 0 to 10) {
      println(i)
    }
    println("Using until")
    for(i <- 0 until 10) {
      println(i)
    }
  }

  def forLoopWithStep = {
    println("------ with step ------")
    for(i <- 0 to 100 by 20) {
      println(i)
    }
  }

  def comprehensionExample = {
    val diceRolls = List(1, 2, 1, 4, 2, 6, 4, 3, 3, 5)
    val peopleList = List("Adam", "Madalina", "Andrei", "Vinita", "Mica", "Patricia")
    val listOfWinners = for {
      roll <- diceRolls // output of each iteration is a number
      person <- peopleList if peopleList.indexOf(person) + 1 == roll // output of each iteration is a String which is filtered
    } yield (person)
    print(listOfWinners)
  }

  def main(args: Array[String]): Unit = {
    simpleForLoop
    forLoopWithStep
    comprehensionExample
  }

}
