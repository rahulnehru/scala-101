package H_monads

import java.io.File

import scala.util.Try

object B_TryExample {

  def main(args: Array[String]): Unit = {

    lazy val file = new File("/somefile")

    val statusCode = try {
      val deletedFile = file.delete()
      println("successfully deleted file")
      if (deletedFile) return 200 else return 401
    } catch {
      case e: Exception => println("error"); 500
    }

    val triedToDelete = Try {file.delete()}
      .map { deleted => if (deleted) 200 else 401 }
      .getOrElse(500)




    // There are two modes of an Try when evalutating... Success(x) and Failure
  }

}


