package week04.users

val users = List(
  User("John", "john@gmail.com", Some("secret")),
  User("Jane", "jane@hotmail.com", None)
)
@main def usersMain(): Unit =
  println(login("john@gmail.com", "secret"))
  println(login("john@gmail.com", "password"))
  println(login("jane@hotmail.com", "secret"))
  println(login("tom@hostpoint.ch", "secret"))

def login (email: String, password: String): Option[String] =
  users.find(u => u.email == email && u.password == Some(password)).map(user => user.name)