package week04

val capitals = Map("CH" -> "Bern", "DE" -> "Berlin", "FR" -> "Paris")
@main def capitalsMain(): Unit =
  println(getCapital("CH"))
  println(getCapital("US"))



// Get a capital
def getCapital(code: String): String =
  capitals.getOrElse(code, "Unknown")