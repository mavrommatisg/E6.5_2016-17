object NumberUtils {
  
  /**
   * Adds two integers and returns the result
   * @param a the first number
   * @param b the second number
   * @return the sum of a and b
   */
  def addNumbers(a: Int, b: Int): Int = {
    a + b
  }
  
  /**
   * Adds two double values and returns the result
   * @param a the first number
   * @param b the second number
   * @return the sum of a and b
   */
  def addNumbers(a: Double, b: Double): Double = {
    a + b
  }
  
  /**
   * Generic method to add two numeric values
   * @param a the first number
   * @param b the second number
   * @return the sum of a and b
   */
  def add[T](a: T, b: T)(implicit numeric: Numeric[T]): T = {
    numeric.plus(a, b)
  }
  
  // Example usage
  def main(args: Array[String]): Unit = {
    println(s"Adding integers: ${addNumbers(5, 3)}")
    println(s"Adding doubles: ${addNumbers(2.5, 3.7)}")
    println(s"Generic add integers: ${add(10, 20)}")
    println(s"Generic add doubles: ${add(1.5, 2.5)}")
  }
}