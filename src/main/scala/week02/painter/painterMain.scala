package week02.painter

@main def painterMain(): Unit =
  val data = painterData()

  // Quick test of the data: All painters born after 1900
  data.filter(_.birthYear > 1900).foreach(println)

  // 1. Print all painters using toString
  println("Exercise 1 - print names of painters:")
  getPainterNames(data).foreach(println)

  // 2. Get all painters who are alive and sort them by name
  println("\nExercise 2 - print all painters who are still alive:")
  val filteredPainters = filterPainters(data, p => p.deathYear.isEmpty).sortBy(_.name)
  getPainterNames(filteredPainters).foreach(println)

  // 3. Print all Spanish painters
  println("\nExercise 3 - print all Spanish painters:")
  val spanishPainters = filterPainters(data, p => p.nationality == CountryCode.ES).sortBy(_.name)
  getPainterNames(spanishPainters).foreach(println)

  // 4. Get all painters from the 19th century
  println("\nExercise 4 - print all painters from the 19th century:")
  val painters19thCentury = paintersOf19thCentury(data)
  getPainterNames(painters19thCentury).foreach(println)

  // 5. Get avg age of dead painters
  println("\nExercise 5 - Get average age of all dead painters:")
  val deadPaintersAge = filterPainters(data, p => p.deathYear.isDefined)


// Get Names of a painter
def getPainterNames(painters: Vector[Painter]): Vector[String] =
  painters.map(p => p.name)

// Get painters by filter and sort by name
def filterPainters(painters: Vector[Painter], pFilter: (Painter => Boolean)): Vector[Painter] =
  painters.filter(pFilter)

// Get painters of the 19th century (1800 - 1899)
def paintersOf19thCentury(painters: Vector[Painter]): Vector[Painter] =
  filterPainters(painters, p => p.birthYear >= 1800 && p.birthYear <= 1899).sortBy(_.birthYear)

def painterData(): Vector[Painter] =
  Vector(
    Painter("Pablo Picasso", 1881, Option(1973), Gender.male, CountryCode.ES),
    Painter("Vincent van Gogh", 1853, Option(1890), Gender.male, CountryCode.NL),
    Painter("Leonardo da Vinci", 1452, Option(1519), Gender.male, CountryCode.IT),
    Painter("Claude Monet", 1840, Option(1926), Gender.male, CountryCode.FR),
    Painter("Salvador Dali", 1904, Option(1989), Gender.male, CountryCode.ES),
    Painter("Henri Matisse", 1869, Option(1954), Gender.male, CountryCode.FR),
    Painter("Rembrandt van Rijn", 1606, Option(1669), Gender.male, CountryCode.NL),
    Painter("Andy Warhol", 1928, Option(1987), Gender.male, CountryCode.US),
    Painter("Georgia O'Keeffe", 1887, Option(1986), Gender.female, CountryCode.US),
    Painter("Michelangelo Buonarroti", 1475, Option(1564), Gender.male, CountryCode.IT),
    Painter("Peter Paul Rubens", 1577, Option(1640), Gender.male, CountryCode.NL),
    Painter("Edgar Degas", 1834, Option(1917), Gender.male, CountryCode.FR),
    Painter("Michelangelo Merisi da Caravaggio", 1571, Option(1610), Gender.male, CountryCode.IT),
    Painter("Pierre-Auguste Renoir", 1841, Option(1919), Gender.male, CountryCode.FR),
    Painter("Rafael Sanzio de Urbino", 1483, Option(1520), Gender.male, CountryCode.IT),
    Painter("Paul Cézanne", 1839, Option(1906), Gender.male, CountryCode.FR),
    Painter("Marc Chagall", 1887, Option(1985), Gender.male, CountryCode.FR),
    Painter("Tiziano Vecellio", 1485, Option(1576), Gender.male, CountryCode.IT),
    Painter("Joan Miró", 1893, Option(1983), Gender.male, CountryCode.ES),
    Painter("Jackson Pollock", 1912, Option(1956), Gender.male, CountryCode.US),
    Painter("Gustav Klimt", 1862, Option(1918), Gender.male, CountryCode.AT),
    Painter("Albrecht Dürer", 1471, Option(1528), Gender.male, CountryCode.DE),
    Painter("Edward Hopper", 1882, Option(1967), Gender.male, CountryCode.US),
    Painter("Wassily Kandinsky", 1866, Option(1944), Gender.male, CountryCode.FR),
    Painter("Jan Vermeer", 1632, Option(1675), Gender.male, CountryCode.NL),
    Painter("Paul Klee", 1879, Option(1940), Gender.male, CountryCode.CH),
    Painter("Edvard Munch", 1863, Option(1944), Gender.male, CountryCode.NO),
    Painter("Francisco de Goya", 1746, Option(1828), Gender.male, CountryCode.ES),
    Painter("Janet Fish", 1938, None, Gender.female, CountryCode.US),
    Painter("Edouard Manet", 1832, Option(1883), Gender.male, CountryCode.FR)
  )