package week03.fibonacci

import scala.io.StdIn.readLine

@main def fibonacciMain(): Unit =
  println("Enter the maximum value:")
  val max = readLine().toInt
  val fibs = fibonacci(max).reverse
  println(s"The fibonacci numbers up to $max are: $fibs")

// Get fibonacci
def fibonacci (max: Int): List[Int] =
  def fibonacci (max: Int, numbers: List[Int]): List[Int] =
  numbers match
    case head :: _ if (head >= max) => numbers
    case head 
