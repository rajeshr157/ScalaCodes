package assignment

object collections {

  def main(args: Array[String]): Unit = {
    val cities = List("Delhi", "Bombay", "Kolkata", "Chennai", "Bengaluru", "Shimla", "Kochi", "Mysore", "Hyderabad", "Thiruvanathapuram")

    var subjects = List("Physics", "Chemistry", "Mathematics", "Biology")

    println(cities.length)
    println()
    println(cities.sorted)

    println()
    println(cities.sortWith(_.length < _.length))

    println()
    subjects = "English" :: subjects
    println(subjects)

    subjects = subjects ++ List("Economics")
    println(subjects)

    val list1 = List("Hi, Good morning", "Have a nice day")
    val list2 = List("Joy", "Sam", "Jack")
    val listoflist = List(list1, list2)

    println()
    println(List("Hi, Good morning", list2))

    println()
    println(listoflist)
  }

}


