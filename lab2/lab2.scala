class PersonS(val givenName: String, var surname: String, val id: String) {
  def name = givenName + " " + surname
  var initials = givenName(0) + surname(0)
}

class Int2DVec(val x: Int, val y: Int) {
  def +(other: Int2DVec) = new Int2DVec(x + other.x, y + other.y)
  def unary_- = new Int2DVec(-x, -y)
  def -(other: Int2DVec) = new Int2DVec(x - other.x, y - other.y)
  def *(other: Int2DVec) = x * other.x + y * other.y
  override def toString() = "(" + x.toString + "," + y.toString + ")"
}

object Appl {
  def main(agrs: Array[String]) {
    val v1 = new Int2DVec(1, 2)
    val v2 = new Int2DVec(10, 20)
    val v3 = v1 + v2
    val v4 = -v2
    println(v3)
    println(v4)
    println(v3 * v4)
  }
}
