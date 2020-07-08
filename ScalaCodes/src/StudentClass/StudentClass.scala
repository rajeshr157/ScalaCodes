package StudentClass

object StudentClass {

  def main(args: Array[String]): Unit = {
    val obj1 = new Student("Ram", 85, 90)
    val obj2 = new Student("Sam", 95, 80)

    println("The Average marks in Math & Science respectively are: " + average(obj1,obj2))

  }

  def average(obj1: Student, obj2: Student): (Double, Double) = {

    val mathsAvg = ((obj1.maths + obj2.maths)/2)
    val scienceAvg = ((obj1.science + obj2.science)/2)

    return (mathsAvg, scienceAvg)
  }
}
