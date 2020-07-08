// A comment!
/* Another comment */
/** A documentation comment */
object MyModuleNew {
	
	
	def abs(n: Int): Int =
		if (n < 0) -n
		else n
		
	def factorial(n: Int): Int = {
		def go(n: Int, acc: Int): Int =
			if (n <= 0) acc
			else go(n-1, n*acc)
			go(n, 1)
	}
		
	

	def formatResult(name: String, n: Int, f: Int, Int => Int) = {
		val msg = "The %s of %d is %d."
		msg.format(name, n, f(n))
	}

	private def formatAbs(x: Int) = {
		val msg = "The absolute value of %d is %d"
		msg.format(x, abs(x))
	}
	
	def main(args: Array[String]): Unit =
		println(formatAbs(-42))
		println(formatResult("absolutelutely value", -42,abs))
		println(formatResult("Factorial", 7, factorial))
	}