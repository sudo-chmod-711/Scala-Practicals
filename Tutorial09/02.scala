class Rational(n: Int, d: Int) {

    require(d != 0, "Denominator must be non-zero")

    private val num: Int = n
    private val deno: Int = d

    def neg: Rational = new Rational(-num, deno)

    def sub(rational: Rational): Rational = new Rational(
      num * rational.deno - rational.num * deno, deno * rational.deno
    )

    override def toString: String = s"$num/$deno"
}

object Q2 {
    def main(args:Array[String]): Unit = {
        val x = new Rational(3, 4)
        val y = new Rational(5, 8)
        val z = new Rational(2, 7)

        println(s"x - z = ${x.sub(z)}")
        println(s"x - y - z = ${x.sub(y.sub(z))}")
    }
}
