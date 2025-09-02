package week03.colors


@main def colorsMain(): Unit =
  val peopleAndColors = Vector(
    ("Leonardo", Color.blue),
    ("Hans", Color.red),
    ("Pierre", Color.yellow),
    ("Susanne", Color.orange)
  )

  // Comment each color and show it
  peopleAndColors.map(getColorComment).foreach(println)

// Get the comment for each color
def getColorComment(nameAndColor: (String, Color)): String =
  nameAndColor match
    case (name, color) if color == Color.blue => s"$name likes blue"
    case (name, color) if color == Color.red => s"$name likes red"
    case (name, color) if color == Color.yellow => s"$name likes yellow"
    case (name, color) if color == Color.orange => s"$name likes orange"
    case (name, color) if color == Color.brown => s"$name likes brown"
    case (name, color) if color == Color.green => s"$name likes green"
    case (name, color) if color == Color.purple => s"$name likes purple"