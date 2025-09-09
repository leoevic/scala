package week04.kattis

// 🧪 Entry point with multiple test cases
@main def testEchoEchoEcho(): Unit =
  val testCases = List(
    ("Short",
      "a",
      "a a a"),

    ("lower case",
      "echo",
      "echo echo echo"),

    ("mixed case",
      "Hello",
      "Hello Hello Hello"),

      ("upper case",
        "ECHO",
        "ECHO ECHO ECHO")
  )

  for (name, input, expected) <- testCases do
    runTest(name, input, expected)(echoechoecho)

def echoechoecho(lines: List[String]): List[String] =
  val input = lines.head.trim // The input word

  // Repeat the word three times, separated by spaces
  val output = ""// <-- Your code here

  // Return a list of Strings, even if there is only one
  List(output)
