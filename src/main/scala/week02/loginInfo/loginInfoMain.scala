package week02.loginInfo

import java.time.LocalDateTime
import scala.util.Random

@main def loginInfoMain(): Unit =
  val data = sampleData()
  
  data.filter(u => u.name.length < 3)
  // Do your exercises here

  // Exercise 1: count of users
  println("Exercise 1 - count of users:")
  val userCount = data.length
  println("Count of users: " + userCount)

  // Exercise 2: users from A-M, sort by names, only name
  println("\nExercise 2 - Users from A-M:")
  val filterAM = (user: User) => ('A' to 'M').contains(user.name.charAt(0).toUpper)
  val usersAM = filterUsers(data, filterAM).sortBy(_.name)
  getUserNames(usersAM).foreach(println)

  // Exercise 3: Get the first user
  println("\nExercise 3 - Get the first user:")
  if (data.headOption.nonEmpty)
    val firstUser = data.head
    val firstLoginTime = firstUser.accessTimes.sorted.head
    println(s"First login time for user ${firstUser.name} is $firstLoginTime");
  else
    println("No users found")

  // Exercise 4: Get first access time of any user
  println("\nExercise 4 - Get first access time of any user:")
  val firstAccessTime = data.flatMap(_.accessTimes).sorted.head
  println(s"The first access time is $firstAccessTime")

  // Exercise 5: Get statistics of all logins for each month

// Get the names of the user
def getUserNames(users: Vector[User]): Vector[String] =
  users.map(_.name)

// Filter users by a filter function
def filterUsers(users: Vector[User], filter: (User => Boolean)): Vector[User] =
  users.filter(filter)

def sampleData(): Vector[User] =
  val data = Vector(User(1, "Fred"), User(2, "Sue"), User(3, "Ann"),
    User(4, "Tom"), User(5, "Ralph"), User(6, "Betty"), User(7, "Sarah"), User(8, "James"))

  val rand = Random()
  val randomAccessTime = () => LocalDateTime.of(2025, rand.between(1, 13), rand.between(1, 29), rand.between(0, 24), rand.between(0, 60))
    data.foreach(u => (1 to 12).foreach { _ => u.addAccessTime(randomAccessTime()) })
  data