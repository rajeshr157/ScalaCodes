object Assignment3 {

  def main():Unit = {
        println(isSorted(Array(2, 5, 9, 11, 15),((x:Int, y:Int) => x <= y)))
  }

  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
      
      def loop (n: Int): Boolean = {
            if (n+1 >= as.length) true
            else if (!ordered(as(n),as(n+1))) false
            else loop (n+1)
               
        }
        loop(0)
    }

    
  
}