import org.scalatest.GivenWhenThen
import org.scalatest.featurespec.AnyFeatureSpec

class FeatureSpecDemo extends AnyFeatureSpec with GivenWhenThen {

  private def obfuscateString(str: String): String = {
    str.zipWithIndex
      .map(c => if(c._2 == 0 || c._2 == str.length - 1) c._1 else "*")
      .fold("")((x,y) => s"$x$y").toString
  }

  info("As a live services team member")
  info("I want to see obfuscated strings in my logs")
  info("So that I am not leaking PII")

  Feature("obfuscateString") {
    Scenario("empty string") {
      Given("my string is empty")
      val str = ""
      When("I pass this to my method")
      val t = obfuscateString(str)
      Then("I expect an empty string back")
      assert(t==str)
    }

  }
}
