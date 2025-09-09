package week04.kattis

import scala.annotation.tailrec

// 🧪 Entry point with multiple test cases
@main def testPet(): Unit =
  val testCases = List(
    ("Sample",
      """|5 4 4 5
         |5 4 4 4
         |5 5 4 4
         |5 5 5 4
         |4 4 4 5""".stripMargin,
      """|4 19""".stripMargin),
    ("First contestant",
      """|5 5 5 5
         |5 4 4 4
         |5 5 4 4
         |5 5 5 4
         |4 4 4 5""".stripMargin,
      """|1 20""".stripMargin),
    ("Last contestant",
      """|3 3 3 3
         |3 4 4 4
         |5 2 4 4
         |5 3 5 4
         |5 4 4 5""".stripMargin,
      """|5 18""".stripMargin),
  )

  for (name, input, expected) <- testCases do
    runTest(name, input, expected)(pet)

def pet(lines: List[String]): List[String] =
  List(bestPet(lines, 1, 0, 0))

// Recursive function
// Base case: No lines left? Create out put from bestIndex and bestScore
// Recursive case: if first line (head) sums to a higher score, then
//                 recursive call: tail, index+1, new bestIndex, new bestScore
// Recursive case: first line (head) is not better than the bestScore
//                 recursive call: tail, index+1, old bestIndex, old bestScore
def bestPet(lines: List[String], index: Int, bestIndex: Int, bestScore: Int): String =
  "" // Your code here

