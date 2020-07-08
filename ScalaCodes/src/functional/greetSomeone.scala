package Functional

object greetSomeone {
  def main(args: Array[String]): Unit = {
    println(intDecorator(5, ((n: Int) => "[" + n + "]")))
    println(intDecorator(5, ((n: Int) => "<b>" + n + "</b>")))

    println()

    val hiSomeone = greetSomeone("Hi")
    println(hiSomeone("Rajesh"))

    val wishSomeone = greetSomeone("Good Morning")
    println(wishSomeone("Sanjay"))
  }

  def intDecorator(i: Int, f: Int => String): String = {
    f(i)
  }

  def greetSomeone(g: String) = (s: String) => {
    g + " " + s
  }

  def greetSomeoneAgain (g: String): (String => String) = {
    def addString(s: String): String = {
      g + " " + s
    }
    addString
  }
}
