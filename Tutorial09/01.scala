class Rational(n: Int, d: Int) {

    require(d != 0, "Denominator must be non-zero")

    private val num: Int = n
    private val deno: Int = d

    def neg: Rational = new Rational(-num, deno)

    override def toString: String = s"$num/$deno"
}

object Q1 {
    def main(args:Array[String]): Unit = {
        val Rational1 = new Rational(2, 7)
        val Rational2 = new Rational(1, 3)

        println(s"Rational1 = ${Rational1}")
        println(s"Rational2 = ${Rational2}")
        println(s"Rational2.neg = ${Rational2.neg}")
    }
}
