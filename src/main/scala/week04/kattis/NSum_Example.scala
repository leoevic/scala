package week04.kattis

import scala.annotation.tailrec

// 🧪 Entry point with multiple test cases
@main def testNsum(): Unit =
  val testCases = List(
    ("Sample 1",
      """|1 1""".stripMargin,
      """|2""".stripMargin),
    ("Sample 2",
      """|1 2 3 4 5""".stripMargin,
      """|15""".stripMargin),
    ("Zeroes",
      """|0 0 0 0 0 0 0""".stripMargin,
      """|0""".stripMargin),
    ("Ten numbers",
      """|7 5 3 2 8 5 5 5 5 5""".stripMargin,
      """|50""".stripMargin),
  )

  for (name, input, expected) <- testCases do
    runTest(name, input, expected)(nsum)

def nsum2(lines: List[String]): List[String] =
  // Your code here
  List(lines.head.split(" ").map(_.toInt).sum.toString)

def nsum(lines: List[String]): List[String] =
  val numbers = lines.head.split(" ").map(_.toInt)
  val answer = mySum(numbers, 0)
  List(answer.toString)

@tailrec
def mySum(numbers: Seq[Int], sum: Int): Int =
  if numbers.length == 0 then
    sum
  else
    mySum(numbers.tail, sum+numbers.head)
