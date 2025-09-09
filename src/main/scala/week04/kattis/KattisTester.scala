package week04.kattis

// ✅ Reusable test harness for Kattis-style problems (ChatGPT)

def runTest(
             name: String,
             input: String,
             expectedOutput: String
           )(f: List[String] => List[String]): Unit =
  val inLines = input.stripMargin.trim.linesIterator.toList
  val expected = expectedOutput.trim
  val result = f(inLines).mkString("\n").trim

  println(s"--- Test: $name ---")
  if result == expected then
    println("✅ Passed\n")
  else
    println(s"❌ Failed\nExpected:\n$expected\nGot:\n$result\n")

