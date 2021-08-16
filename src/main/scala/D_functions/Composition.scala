package D_functions

object Composition {

  type W = Long
  type X = Int
  type Y = String
  type Z = Boolean

  val functionA: W => X = ???
  val functionB: X => Y = ???
  val functionC: Y => Z = ???

  val programmeUsingAndThen: W => Z = functionA andThen functionB andThen functionC
  val programmeUsingCompose: W => Z = functionC compose functionB compose functionA

  
}
