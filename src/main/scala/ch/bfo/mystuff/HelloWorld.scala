package ch.bfo.mystuff

import scala.io.StdIn.readLine

@main def helloWorld(): Unit =
  println("Hello, World!")

@main def main1(): Unit =
  println("Enter several temperatures on a single line ")
  val numbers = readLine().split(" ").map(_.toInt)
  val belowZero = countBelowZero(numbers)
  println(s"Number of temperatures below zero is $belowZero")

def countBelowZero(numbers: Array[Int]): Int =
  numbers.count(i => i < 0)

@main def main2(): Unit =
  println("Geben Sie ein Wort ein")
  val word = readLine().toLowerCase().toCharArray
  val letters = getLetters(word)
  println("Es gibt folgende Buchstaben:")
  letters.foreach(println)

def getLetters(word: Array[Char]): Set[Char] =
  word.filter(i => i.toString().matches("[A-Za-z]")).toSet