package ch.bfo.mystuff

import scala.io.StdIn.readLine

@main def helloWorld(): Unit =
  println("Hello, World!")

/* Exercise 1: Temperatures on a single line */
@main def main1(): Unit =
  println("Enter several temperatures on a single line ")
  val numbers = readLine().split(" ").map(_.toInt)
  val belowZero = countBelowZero(numbers)
  println(s"Number of temperatures below zero is $belowZero")

def countBelowZero(numbers: Array[Int]): Int =
  numbers.count(i => i < 0)

/* Exercise 2: Get characters of a word */
@main def main2(): Unit =
  println("Geben Sie ein Wort ein")
  val word = readLine().toLowerCase().toCharArray
  val letters = getLetters(word)
  println("Es gibt folgende Buchstaben:")
  letters.foreach(println)

def getLetters(word: Array[Char]): Set[Char] =
  word.filter(i => i.toString().matches("[A-Za-z]")).toSet

/* Exercise 3: Reverse order of words and make them UPPERCASE */
@main def main3(): Unit =
  println("Geben Sie einen Satz ein:")
  val sentence = readLine()
  val newSentence = revertAndUpperCase(sentence)
  println(newSentence.toString)

def revertAndUpperCase(sentence: String): String =
  sentence.split(" ").map(_.toUpperCase).reverse.mkString(" ")


/* Exercise 4: Squares of a set */
@main def main4(): Unit =
  val numbersSet = Set(1, 2, 3, 4, 5, 6, 7, 8, 9)
  val newSet = squaredSet(numbersSet)
  newSet.foreach(println)

def squaredSet(numbers: Set[Int]): Set[Int] =
  numbers.map(i => i * i)