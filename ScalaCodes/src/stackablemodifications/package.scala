package stackablemodifications

object StackableModifications {

  //Base Abstract Class Pizza
  abstract class Pizza {
    def price(): Double

    def description(): String
  }

  //We also have a class VegDelightPizza
  class VegDelightPizza extends Pizza {
    override def price(): Double = 10.0

    override def description(): String = "Veg Delight Pizza"

    def printDesc() = println(description)

    def printPrice() = println("Price : $" + price)
  }

  //Our restricted traits for extra
  //Trait for adding Extra Mozzarella Cheese
  trait ExtraMozzarellaCheese extends VegDelightPizza {
    override def price(): Double = super.price + 0.50

    override def description(): String = super.description + "\n + Extra Mozzarella Cheese "
  }

  //Trait for adding Extra Tomato Toppings
  trait ExtraTomatoToppings extends VegDelightPizza {
    override def price(): Double = super.price + 0.75

    override def description(): String = super.description + "\n + Extra Tomato Toppings"
  }

  //Trait for adding Extra Black Olives
  trait ExtraBlackOlives extends VegDelightPizza {
    override def price(): Double = super.price + 0.15

    override def description(): String = super.description + "\n + Extra Black Olives"
  }

  def main(args: Array[String]) {

    println("Our First Pizza")
    //This is how you implement stackable traits
    var pizza1 = (new VegDelightPizza
      with ExtraMozzarellaCheese
      with ExtraBlackOlives)
    pizza1.printDesc
    pizza1.printPrice
    println("")


    println("Our Second Pizza")
    //Another implementation of stackable traits
    var pizza2 = (new VegDelightPizza
      with ExtraMozzarellaCheese
      with ExtraBlackOlives
      with ExtraTomatoToppings)
    pizza2.printDesc
    pizza2.printPrice
  }
}