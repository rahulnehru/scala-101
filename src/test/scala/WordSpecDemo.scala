import org.scalatest.wordspec.AnyWordSpec
import org.scalatest._
import matchers.should.Matchers._

class WordSpecDemo extends AnyWordSpec {

  private def obfuscateString(str: String): String = {
    str // hello
      .zipWithIndex // List( (h, 0), (e, 1), (l, 2), (l, 3), (o, 4) )
      .map(c => if(c._2 == 0 || c._2 == str.length - 1) c._1 else "*") // List( (h, 0), (*, 1), ... (o, 4))
      .fold("")((x,y) => s"$x$y").toString
  }

  "obfuscateString" should {
    "return empty string" when {
      "string is empty" in {
        val str = ""
        obfuscateString(str) should be ("")
        obfuscateString(str) should not be ("hello")
      }
    }

    "return obfuscated string" when {

      "string is two characters long" in {
        val str = "cy"
        obfuscateString(str) should be ("cy")
      }

      "non empty and more than 2 characters long" in {
        val str = "hello"
        obfuscateString(str) should equal ("h***o")
      }
    }
  }
}


