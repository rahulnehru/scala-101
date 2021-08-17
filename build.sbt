name := "scala-101"

version := "0.1"

scalaVersion := "2.13.1"


val productionDependencies = List(

)
val testDependencies = List(
  "org.scalactic" %% "scalactic" % "3.2.9",
  "org.scalatest" %% "scalatest" % "3.2.9" % "test"
)

libraryDependencies ++= productionDependencies ++ testDependencies

lazy val printHelloPrompt = taskKey[Unit]("says hello to everybody :)")
printHelloPrompt := printHelloWorld
(compile in Compile) := ((compile in Compile) dependsOn printHelloPrompt).value


def printHelloWorld = {
  println("hello, world")
}