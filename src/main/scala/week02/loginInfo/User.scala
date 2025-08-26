package week02.loginInfo

import java.time.LocalDateTime
import scala.collection.mutable.ArrayBuffer

class User(val id: Int, val name: String):
  val accessTimes: ArrayBuffer[LocalDateTime] = ArrayBuffer()

  def addAccessTime(accessTime: LocalDateTime): Unit =
    accessTimes.addOne(accessTime)

  override def toString: String =
    s"$name ($id): first access time is ${accessTimes(0)}"
