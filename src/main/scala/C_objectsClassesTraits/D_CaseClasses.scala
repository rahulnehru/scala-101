package C_objectsClassesTraits

/*
Case classes are similar to regular classes, but are useful for creating data structures, like POJOs in Java,
or dicts in Python. These are immutable.

They come with some nice out-of-the-box functionality;
  * you don't need to use the _new_ keyword to instantiate them
  * you get a free, default "apply" method, or constuctor
 */

case class ShoppingItem(name: String, price: Double)

object Checkout {

  val food = ShoppingItem.apply("Walkers Crisps", 0.70)
  val drink = ShoppingItem("Coca Cola 70cl", 1.10)

//  val food1 = ShoppingItem("Walkers Crisps", 0.70) // syntactic sugar

  val expensiveDrink = drink.copy(price = 2.00)

  def main(args: Array[String]): Unit = {
    println(s"total price = ${food.price + drink.price}")
    println(s"expensive drink name = ${expensiveDrink.name}")
    println(s"expensive drink price = ${expensiveDrink.price}")
  }
}


