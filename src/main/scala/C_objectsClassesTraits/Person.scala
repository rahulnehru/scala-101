package C_objectsClassesTraits

case class Person(name: String,
                  age: Int,
                  address: Address,
                  nameOfPet: String) {
}


case class Address(line1: String,
                   line2: String,
                   townCity: String,
                   postCode: String,
                   country: String = "UK")


