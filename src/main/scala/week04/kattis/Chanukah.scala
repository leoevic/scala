package week04.kattis

import scala.annotation.tailrec

// 🧪 Entry point with multiple test cases
@main def testChanukah(): Unit =
  val testCases = List(
    ("Sample 1",
      """|1 8
         |2 1
         |3 10""".stripMargin,
      """|1 44
         |2 2
         |3 65""".stripMargin),
  )

  for (name, input, expected) <- testCases do
    runTest(name, input, expected)(chanukah)

def chanukah(lines: List[String]): List[String] =
  List("") // Your code here