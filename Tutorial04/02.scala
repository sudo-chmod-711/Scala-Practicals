object Q2 {
    def main(args:Array[String]): Unit = {
        PatternMatching()
    }

    def PatternMatching(): Unit = {
        val givenNumber = getInput()
        println()
        println(numberChecker(givenNumber))
    }

    def getInput(): Int = {
        print("Enter a number : ")
        return scala.io.StdIn.readInt()
    }

    def numberChecker(number: Int): String = number match {
        case n if number  <= 0 =>
          return "Negative/Zero is input"
        case n if number % 2 == 0 =>
          return "Even number is given"
        case _ =>
          return "Odd number is given"
    }

}
