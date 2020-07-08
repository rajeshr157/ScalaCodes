package Closures

object closureDemo {

  def main(args: Array[String]): Unit = {
    var initialprice = 100.0
    //val gst = 9.5
    //var serviceTax = 12.5

    println(finalPrice(initialprice))
  }

  var gst = 10.0
  var serviceTax = 12.5

  def finalPrice(initialprice: Double): Double = {

    val mrp = initialprice + ((gst/100)*initialprice) + ((serviceTax/100)*initialprice)

    mrp

  }
}
