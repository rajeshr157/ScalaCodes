object Assignment1{

    def add(x: Int, y:Int): Int =
        x + y

    def sub(x: Int, y:Int): Int =
        x - y

    def mul(x: Int, y: Int): Int = 
        x * y

    def lowme(x: String): String = {
        val low = x.toLowerCase()
        low
    }

    def addhof(x: Int, y: Int): Int = {
        x + mul(x,y)
    }   

    def calc(x:Int , y: Int, f: (Int, Int) => Int) : Int = {
        x + (f (x,y))
    }


    def formatresult(name: String, x: Int, y:Int, f: (Int, Int) => Int) = {
        val msg = "The %s of %d & %d is %d."
        msg.format(name, x, y, f(x,y))
    }


    def main(): Unit = {
        println("Sum of 5 & 4 is: " + add (5,4))
        println("Difference of 5 & 4 is: " + sub (5,4))
        println("Product of 5 & 4 is: " + mul (5,4))
        println(lowme ("THIS SHOULD BE IN LOWER CASE"))
        println(formatresult("Sum", 10, 5, add))
        println(formatresult("Difference", 10, 5, sub))
        println(formatresult("Product", 10, 5, mul))
        println(formatresult("HOF Addition", 10, 5, addhof))
        println("HOF CALC:" + calc(10,5,mul))
    
        
    }
	
}


