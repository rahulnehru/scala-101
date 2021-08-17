package A_variables

object E_Scope {

  // Scope is quite often complicated in certain languages, Scala tries to simplify it

  class ScopeDefiningClass {
    val publicByDefault = 1
    private val privateExplicitly = 2 // same as private[this]
    private[A_variables] val onlyAvailableInThisPackage = 3
    private[E_Scope] val availableOnlyInEScope = 4
    protected val availableOnlyToSubclasses = 5
  }

  class ScopeExtendingClass extends ScopeDefiningClass {
    println(publicByDefault)
//      println(privateExplicitly) -- does not compile
    println(onlyAvailableInThisPackage)
    println(availableOnlyInEScope)
    println(availableOnlyToSubclasses)
  }

  def main(args: Array[String]): Unit = {
    new ScopeExtendingClass()
  }

}
