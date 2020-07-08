package traits

object traitAssignment {

  def main(args: Array[String]): Unit = {

    println("Test code")

    val obj1 = new traitEx1 {}
    val obj2 = new traitEx1 {}
    val obj3 = new traitEx2 {}

    val obj4 = (new DerivedClass with traitEx1 with traitEx2)

    val obj5 = (new DerivedClass with traitEx1 with traitEx2 with traitEx3)

    println()
    println(obj1.method1())
    println(obj1.method2())
    println(obj2.method1())
    println(obj2.method2())
    println(obj3.method1())
    println(obj3.method2())

    println()
    println(obj4.method1())
    println(obj4.method2())
    println(obj4.method1())

    println()
    println(obj4.method2())
    println(obj5.method3())
  }

}

trait traitEx1 {
  def method1() : String = {
    "traitEx1: method1"
  }

  def method2() : String = {
    "traitEx1: method2"
  }
}

trait traitEx2 {
  def method1() : String = {
    "traitEx2: method1"
  }

  def method2() : String = {
    "traitEx2: method2"
  }
}

class DerivedClass extends traitEx1 with traitEx2 {
  override def method1(): String = "Derived Class:Method 1 " + super.method1()

  override def method2(): String = "Derived Class:Method 2 " + super.method2()


}

trait traitEx3 extends DerivedClass with traitEx1 with traitEx2 {
  def method3() : String = {
    "traitEx3: method3 which extends Derived Class"
  }
}