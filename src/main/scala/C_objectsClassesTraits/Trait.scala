package C_objectsClassesTraits


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

trait Quacks {

  def quack = println("Quack!")

}


trait Swims {

  def swim = println("splash!")

}