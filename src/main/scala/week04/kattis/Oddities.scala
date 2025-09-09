package week04.kattis

// 🧪 Entry point with multiple test cases
@main def testOddities(): Unit =
  val testCases = List(
    ("Sample",
      """|10
         |9
         |-5""".stripMargin,
      """|10 is even
         |9 is odd
         |-5 is odd""".stripMargin),
  )

  for (name, input, expected) <- testCases do
    runTest(name, input, expected)(oddities)

def oddities(lines: List[String]): List[String] =
  lines.map(_.toInt match
    case x if ((x & 1) == 0) => s"$x is even"
    case x if ((x & 1) == 1) => s"$x is odd"
    case _ => "todo" // Fill in your cases here
  )
