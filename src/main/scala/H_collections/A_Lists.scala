package H_collections

object A_Lists {

  def main(args: Array[String]): Unit = {

    val listOfNumbers: List[Int] = List(1, 2, 3, 4, 5)
    // lets add a number to this list:
    val listWith6 = listOfNumbers :+ 6
    println(listOfNumbers) // this is immutable so nothing will change
    println(listWith6) // this is your new list object with 6 added to it

    // you can use :: to append items to the beginning of the list
    val friendsCharacters = List("Joey", "Chandler")
    val weForgotRoss = "Ross" :: friendsCharacters
    println(weForgotRoss)

    // Nil is representation for an empty list, which means you can create new lists like this:
    val typesOfBirds = "Parrot" :: "Swan" :: "Pigeon" :: Nil
    // "Parrot" :: (Swan :: (Pigeon :: Nil))
    // Parrot :: (Swan :: List(Pigeon))
    // Parrot :: List(Swan, Pigeon)
    // List(Parrot, Swan, Pigeon)
    println(typesOfBirds)

    // And you can prepend a list to the head of the second list
    val moreBirds = typesOfBirds ::: List("Goose", "Canary")
    println(moreBirds)

    // And you can add some lists together
    val list1 = List("A", "B")
    val list2 = List("C", "D")
    println(list1 ++ list2)

  }

}
