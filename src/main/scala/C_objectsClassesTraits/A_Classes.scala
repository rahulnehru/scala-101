package C_objectsClassesTraits

/*
  Scala offers classes in the same way as Java to support object-oriented-programming.
  Below is an example of a POJO which would be represented as the following Java code:

  public class Forest {
    private String name;
    private int area;
    public Forest(String name, int area) {
      this.name = name;
      this.area = area;
    }

    public String getName() {
      return this.name;
    }
    public void setName(String name) {
      this.name = name;
    }
    public int getArea() {
      return this.name;
    }
    public void setArea(int area) {
      this.area = area;
    }
  }
 */

class Forest(var name: String, val area: Int)

object Main {
  def main(args: Array[String]): Unit = {
    val sherwood = new Forest("sherwood", 125)
    println(sherwood.area)
    println(sherwood.name)
  }
}
