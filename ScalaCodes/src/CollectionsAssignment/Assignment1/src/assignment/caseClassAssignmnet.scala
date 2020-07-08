package assignment

import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList

object caseClassAssignmnet {

  def main(args: Array[String]): Unit = {

    val obj1 = Person("Ram", 27)
    val obj2 = Person("Sam", 25)
    val obj3 = Person("Joy", 24)
    val obj4 = Person("Spark", 23)
    val obj5 = Person("Miya", 22)

    var objlist = List(obj1, obj2, obj3, obj4, obj5)

    println(objlist.sortWith(_.age<_.age))
  }

  case class Person(name: String, age: Int)

}
