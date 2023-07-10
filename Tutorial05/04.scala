object Q4 {
    def main(args:Array[String]): Unit = {
        getInput()
    }

    def OddorEven(n: Int): String = {
        if (n == 0)
            return "Even"
        else if (n == 1)
            return "Odd"
        else 
            return OddorEven(n -2)
    }

    def getInput(): Unit = {
        print("Enter a number : ")
        output(scala.io.StdIn.readInt())
    }

    def output(number:Int): Unit = {
        println(s"${number} is an ${OddorEven(number)} number!")
    }
}
