package ch.bfo.mystuff

import scala.math.ceil


/* Problem 1: Multiples of 3 or 5 */
@main def problem1(): Unit =
  val threshold = 10
  val setOfThree = getMultiples(3, threshold)
  val setOfFive = getMultiples(5, threshold)
  val result = setOfThree.sum + setOfFive.sum
  println(result)

def getMultiples(number: Int, threshold: Int): List[Int] =
  for (i <- 1 until ceil((threshold / number)).toInt)) map(i => i * number).toList