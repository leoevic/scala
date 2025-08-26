package week02.loginInfo

@main def flatMapMain(): Unit =
  val data = Vector("Hello World", "Welcome to Mars")
  
  // Using map, we get a list of lists
  val mappedWords = data.map(_.split(" "))
  mappedWords.foreach(_.foreach(println))

  println
  
  // Using flatMap, the lists are combined
  val allWords = data.flatMap(_.split(" "))
  allWords.foreach(println)