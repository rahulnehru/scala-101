package C_objectsClassesTraits

/*
You can define an abstract class
 */

abstract class PlaceOfInterest(name: String, area: Int, greenSite: Boolean) {

  def getLandPrice: Double = area * 1.4

}

class RecyclingPlant(name: String, area: Int) extends PlaceOfInterest(name, area, false) {

  def recyclingCapacity: Int = area + 300

}

object POIs {
  def main(args: Array[String]): Unit = {
    val recyclingPlant = new RecyclingPlant("landfill", 300)
    println(s"Recycling capacity = ${recyclingPlant.recyclingCapacity}")
    println(s"Price of land = ${recyclingPlant.getLandPrice}")
  }
}