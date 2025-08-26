package week02.loginInfo

import week02.loginInfo.User

import java.time.LocalDateTime
import scala.util.Random

@main def loginSolution(): Unit =
  val data = sampleData()
  
  // Count the number of users
  println(s"Number of users: ${data.length}")

  // Return names, sorted. Anonymous function for the filter
  val nameFilter = (u: User) => u.name.compareTo("N") < 0
  val names = data.filter(nameFilter).map(_.name).sorted
  names.foreach(println)

  // Return the earliest access time for the first user
  if (data.headOption.nonEmpty)
    val user = data.head
    val firstAccess = user.accessTimes.sorted.head
    println(s"Earliest access time of first user is $firstAccess")
  else
    println("No users") // won't happen, of course

  // Return the earliest access time of any user
  val earliest = data.flatMap(_.accessTimes).sorted.head
  println(s"Earliest access time by anyone is $earliest")

  // Print the number of accesses in each month
  val accessesInMonth = (month: Int, accesses: Vector[LocalDateTime]) =>
    accesses.count(a => a.getMonthValue == month)

  val accesses = data.flatMap(_.accessTimes)
  (1 to 12).map(month => accessesInMonth(month, accesses)).foreach(println)
