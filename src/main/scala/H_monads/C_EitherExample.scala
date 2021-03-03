package H_monads

object C_EitherExample {

  case class DogBreed(breed: String, countryOfOrigin: String, population: Int) // this is the body of a 200 response
  case class ErrorResponse(exceptionMsg: String, statusCode: Int)
  class DogService {
    def getFavouriteBreed: DogBreed = DogBreed("Shih-tzu", "China", 4000)
  }

  val service = new DogService()

  def getMostPopularDogBreed: Either[DogBreed, ErrorResponse] = {
    val favouriteDogBreed = service.getFavouriteBreed
    if(favouriteDogBreed.population > 100) {
      Left(favouriteDogBreed)
    } else {
      Right(ErrorResponse("Not enough dog samples", 500))
    }
  }

  def main(args: Array[String]): Unit = {
    getMostPopularDogBreed match {
      case Left(x) => println("we have a left")
      case Right(x) => println("we have a right")
    }
    println(getMostPopularDogBreed)

    // There are two modes of an Either when evalutating... Left(x) and Right(x)
  }

}


