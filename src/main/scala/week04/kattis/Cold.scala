package week04.kattis

// 🧪 Entry point with multiple test cases
@main def testCold(): Unit =
  val testCases = List(
    ("Sample",
      """|5 -10 15""".stripMargin,
      """|1""".stripMargin),
    ("None",
      """|25 30 0 999999""".stripMargin,
      """|0""".stripMargin),
    ("All",
      """|-1""".stripMargin,
      """|1""".stripMargin),
  )

  for (name, input, expected) <- testCases do
    runTest(name, input, expected)(cold)

// List(...) puts your answer into a list (required by the testing framework)
// line.head gives you the first (and only) line of input. Continue the
// functional expression from here: count the number of negative temperatures.
// Don't forget to turn the final answer into a String!
def cold(lines: List[String]): List[String] =
  List(lines.head.split(" ").map(_.toInt).count(_ < 0).toString)
