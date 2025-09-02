package week03.book
import java.time.Year


@main def BookMain(): Unit =
  val books = Vector(
    Book("Think and Grow Rich", "Napoleon Hill", 1937),
    Book("Schnelles Denken, Langsames Denken (Deutsch)", "Daniel Kahneman", 2012),
    Book("Thinking, Fast and Slow", "Daniel Kahneman", 2011),
    Book("Atomic Habits", "James Clear", 2018),
    Book("War and Peace", "Leo Tolstoi", 1869)
  )

  // Get all books with specific beginning
  println("Get all books with specific beginning:")
  beginsWith(books, "think").foreach(println)

  // Get all classic books
  println("\nGet all classic books:")
  getClassicBooks(books).foreach(println)

// Get all books with specific beginning
def beginsWith(books: Vector[Book], word: String): Vector[Book] =
  books.filter(book => book.title.toLowerCase.startsWith(word.toLowerCase))

// Get all classic books (older than 50 years)
def getClassicBooks(books: Vector[Book]): Vector[Book] =
  books.filter(book => (Year.now.getValue - book.year) > 50)
