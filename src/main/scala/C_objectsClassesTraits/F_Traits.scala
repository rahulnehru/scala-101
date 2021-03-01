package C_objectsClassesTraits

/*
Traits are used as contracts in Scala, and can be used and thought of in two ways:
  * as an interface in Java
  * injections of behaviours

Multiple traits can be mixed-in to an object.
 */

sealed trait Quacks { def quack = println("Quack!") }

trait Swims {
  def swim = println("Splash!")
}

/*
 Our Duck object needs to be able to swim and quack. Our athletic swimmer does not however need to quack!
 */

object Duck extends Quacks with Swims {

  def main(args: Array[String]): Unit = {
    swim
    quack
  }
}


object AthleticSwimmer extends Swims {

  def main(args: Array[String]): Unit = {
    swim
  }

}