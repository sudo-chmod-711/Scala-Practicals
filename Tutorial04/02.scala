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

    def numberChecker(number: Int): String = {
        if (number  <= 0)
          return "Negative/Zero is input"
        else if (number % 2 == 0)
          return "Even number is given"
        else
          return "Odd number is given"
  }

}
