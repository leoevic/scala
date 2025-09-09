package week04.testScores

val testScores: Map[String, Option[Int]] =
  Map(
    "Anna" -> Some(75),
    "Bob" -> Some(40),
    "Dave" -> None
  )

// Main
@main def testScoresMain(): Unit =
  println(testResult("Anna"))
  println(testResult("Bob"))
  println(testResult("Charles"))
  println(testResult("Dave"))

// Get the test result
def testResult(name: String): String =
  testScores.get(name) match
    case None => "Student not found"
    case Some(None) => "No test"
    case x if x.flatten.get >= 60 => "Pass"
    case x if x.flatten.get < 60 => "Fail"