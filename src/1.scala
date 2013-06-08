object Euler1 {

  def fizz(num:Int) = num % 3 == 0
  def buzz(num:Int) = num % 5 == 0

  def main(args: Array[String]): Unit = {

    val list = for{ i <- 1 to 999 if(fizz(i) || buzz(i))} yield i

    println(list.sum)

  }
}