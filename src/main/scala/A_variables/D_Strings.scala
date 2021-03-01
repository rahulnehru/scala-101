package A_variables

object D_Strings {

  val stringA = "A"
  val stringB = 'B'
  val stringC = "C"

  val multilineString =
    """this
      |is
      |a
      |piece
      |of
      |string
      |spanning
      |multiple
      |lines
      |without
      |needing
      |\n
      and
        it
          also
            adheres
              to
                your
                  indentation
                    if
                      you
                        leave
                          off
                            the
                              "|"
    """.stripMargin

  def main(args: Array[String]): Unit = {
    println(stringA + " " + stringB + " " + stringC)
    println(s"$stringA $stringB $stringC")
    println(s"$stringA $stringB ${if(1==1) stringC else ""}")

    println(multilineString)
  }

}
