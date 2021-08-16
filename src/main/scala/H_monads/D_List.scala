package H_monads

object D_List {

  val list = List("the", null, "quick", "brown", null, "fox", "jumped", "over", null, "the", "lazy", "cow")

  val getFirstCharIfNotNull: List[Option[Char]] = list.map(_.headOption)
  val listOfAllNonNullFirstChars: List[Char] = getFirstCharIfNotNull.flatten
  val usingFlatmap: List[Char] = list.flatMap(_.headOption)


  
}


