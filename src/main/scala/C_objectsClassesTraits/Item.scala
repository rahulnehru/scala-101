package C_objectsClassesTraits

object Item {


  def main(args: Array[String]): Unit = {
    println(Item("bananas:10"))
  }

  def processNewShipment(item: Item): Int = {
    item.quantity + 10;
  }

  def apply(nameAndPriceAsString: String): Item = {
    val list = nameAndPriceAsString.split(":").toList

    Item(list.head, list.last.toInt, 10)
  }


}



case class Item(name: String,
                price: Int,
                quantity: Int) {


  def getLabel = s"$name : $price, hooray $quantity are available"

}


