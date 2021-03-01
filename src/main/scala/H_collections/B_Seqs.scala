package H_collections

object B_Seqs {

  def main(args: Array[String]): Unit = {

    // A List is the equivalent of ArrayList (actual implementation in Java)
    // A Seq is the interface, or trait e.g. List<> in Java

    val listOfNumbers: Seq[Int] = List(1, 2, 3, 4, 5)

    // Scala does provide a generic implementation of Seq, called Seq, which you can more easily convert into other coll types
    val listOfStrings: Seq[String] = Seq("A", "B", "C")

  }

}
