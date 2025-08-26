package week02.painter

import week02.painter.CountryCode.ES

@main def painterSolutions(): Unit =
  val data = painterData()

  // print all painters still alive
  data.filter(_.deathYear == None).foreach(println)
  println("-----------------------")

  // print all Spanish painters, sorted by name
  data.filter(_.nationality == ES).sortBy(_.name).foreach(println)
  println("-----------------------")

  // Create a function: Returns all painters born 1800-1899,
  // and sort them by birthYear
  // Call this function, then print the results
  paintersBornCentury(data).foreach(println)
  println("-----------------------")

  // Create a function: Calculate the average age of all dead painters.
  // To calculate the age, just subtract: deathYear - birthYear.
  println(s"Average age at death is ${avgAge(data)}")

def paintersBornCentury(data: Vector[Painter]): Vector[Painter] =
  data.filter(p => p.birthYear >= 1800 && p.birthYear <= 1899)
    .sortBy(_.birthYear)

def avgAge(data: Vector[Painter]): Int =
  val deadPainters = data.filter(_.deathYear.nonEmpty)
  val sumOfAges = deadPainters.map(p => p.deathYear.get - p.birthYear).sum
  sumOfAges / deadPainters.length