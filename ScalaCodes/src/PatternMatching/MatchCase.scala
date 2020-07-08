package PatternMatching

object MatchCase {

  def main(args: Array[String]): Unit = {
    println(matchTest(2))
    println(matchTest(5))
  }

  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "other"
  }
}
