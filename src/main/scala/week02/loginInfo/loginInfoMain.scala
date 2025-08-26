package week02.loginInfo

import java.time.LocalDateTime
import scala.util.Random

@main def loginInfoMain(): Unit =
  val data = sampleData()
  
  data.filter(u => u.name.length < 3)
  // Do your exercises here

def sampleData(): Vector[User] =
  val data = Vector(User(1, "Fred"), User(2, "Sue"), User(3, "Ann"),
    User(4, "Tom"), User(5, "Ralph"), User(6, "Betty"), User(7, "Sarah"), User(8, "James"))

  val rand = Random()
  val randomAccessTime = () => LocalDateTime.of(2025, rand.between(1, 13), rand.between(1, 29), rand.between(0, 24), rand.between(0, 60))
    data.foreach(u => (1 to 12).foreach { _ => u.addAccessTime(randomAccessTime()) })
  data