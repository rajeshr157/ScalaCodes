object Assignment2 {

  def main():Unit = {
    println(findFirst(Array("Raj","Ram","Jay"),(x:String) => x == "Jay" ))

  }

  def findFirst[A](as: Array[A], p: A => Boolean): Int = {
    @annotation.tailrec
    def loop(n: Int): Int =
      if (n >= as.length) -1
      else if (p(as(n))) n
      else loop(n + 1)
    loop(0)
  }

  def main2():Unit = {
        println(isSorted(Array(6, 7, 9, 16, 15),((x:Int, y:Int) => x<=y)))
  }

  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop (n: Int): Boolean = {
      if (n <= (as.length-2)) {
        if (ordered(as(n),as(n+1))) loop(n+1)
         else false
      }
      else true
    }
    loop(0)
  }

}
