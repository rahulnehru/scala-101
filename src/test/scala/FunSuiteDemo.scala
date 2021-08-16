import org.scalatest.funspec.AnyFunSpec

class FunSuiteDemo extends AnyFunSpec {

  private def obfuscateString(str: String): String = {
    str.zipWithIndex
      .map(c => if(c._2 == 0 || c._2 == str.length - 1) c._1 else "*")
      .fold("")((x,y) => s"$x$y").toString
  }

  describe("obfuscateString") {
    describe("when passed empty string") {
      it("should return empty string") {
        assert(obfuscateString("")=="")
      }
    }
    describe("when passed null") {
      it("should throw exception") {
        assertThrows[NullPointerException](obfuscateString(null))
      }
    }
  }

}
