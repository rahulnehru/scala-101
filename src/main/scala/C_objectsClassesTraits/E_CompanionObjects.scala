package C_objectsClassesTraits

case class MobilePhone(manufacturer: String,
                       model: String,
                       price: Double = 799.00)  // you can define default values

object MobilePhone {

  def apply(model: String): MobilePhone = {
    if(model.contains("iPhone")) {
      new MobilePhone(manufacturer = "Apple", model)
    } else {
      new MobilePhone("N/A", model)
    }
  }

  // you can define static members in here
  def lifespanInYears(phone: MobilePhone) = if(phone.manufacturer == "Apple") 2.5 else 3.0
  // you can ascribe some more functionality here
}

object PhoneShop {
  def main(args: Array[String]): Unit = {
    val iPhone = MobilePhone("iPhone 3G")
    val samsungS4 = MobilePhone("Samsung", "S4", 300.00)
    val samsungS5 = MobilePhone("S5")
    val iPhoneLifeSpanInYears = MobilePhone.lifespanInYears(iPhone)
  }


}



