package E_collections


object MapExample {

  val map: Map[String, Int] = Map("hello" -> 1, "world" -> 2)

  val t: Map[String, Int] = map.map(e => ("_" + e._1, e._2))


  def main(args: Array[String]): Unit = {
    println(t)

  }

}
