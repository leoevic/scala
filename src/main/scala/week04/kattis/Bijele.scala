package week04.kattis

import scala.annotation.tailrec

// 🧪 Entry point with multiple test cases
@main def testBijele(): Unit =
  val testCases = List(
    ("all correct",
      "1 1 2 2 2 8",
      "0 0 0 0 0 0"),

    ("missing king and pawn",
      "0 1 2 2 2 7",
      "1 0 0 0 0 1"),

    ("too many pieces",
      "2 0 1 2 1 7",
      "-1 1 1 0 1 1")
  )

  for (name, input, expected) <- testCases do
    runTest(name, input, expected)(bijele)

def bijele(lines: List[String]): List[String] =
  val expected = List(1, 1, 2, 2, 2, 8) // The expected values
  val found = lines.head.split(" ").map(_.toInt).toList // The values we have

  // Write a recursive function to compare the lists and return List[Int] of differences
  val diffs = compareLists(expected, found)// <-- Call your function here

  // Turn the list of differences into Strings separated by spaces
  val result = diffs.mkString(" ")
  // Return a list of Strings, even if there is only one
  List(result)

// Compare lists
def compareLists(expected: List[Int], found: List[Int]): List[Int] =
  @tailrec
  def compareLists(expected: List[Int], found: List[Int], differences: List[Int]): List[Int] =
    expected match
      case x if x.isEmpty => differences.reverse
      case _ => compareLists(expected.tail, found.tail, (expected.head - found.head) :: differences)
  compareLists(expected, found, List())