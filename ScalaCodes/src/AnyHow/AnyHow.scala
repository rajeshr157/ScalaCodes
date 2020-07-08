package AnyHow

class AnyHow(x: String) {

  override def toString: String = {
    "Any How I have " + x + ", I don't have to worry"
  }

  override def hashCode(): Int = {
    x.hashCode()
  }
}
