package A_variables

object A_Variables {

  /*
  There are two ways of defining members.
  var is used for mutable variables, you can reassign the value of these after they have been instantiated
  val is used for immutable variables, these cannot be modified

  In Scala, we typically prefer functional purity, this means an operation will take a value and return a value.
  If an operation changes the value of a var, this is known as a side-effect and it is deemed functionally impure.

  Why do we care about functional purity? As humans, we like predictability, and so it is more readable and
  understandable when reading code to know a method takes a String and returns a number rather than trying to
  work out which operation is changing the value of a variable somewhere else in our code base. This characteristic
  of functional purity is known as referential transparency.
   */


  var a = "My name is "
  val b = "Rahul"

  def main(args: Array[String]): Unit = {
    println(s"a = $a")
    println(s"b = $b")

    a = "bat"
    println(s"a = $a")
  }

}
