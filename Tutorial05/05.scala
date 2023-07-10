object Q5 {
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

    def sumOfAllEven(n: Int): Int = {
        if (n == 0)
            return 0
        else
            return (n + sumOfAllEven(n - 2))
    }

    def getInput(): Unit = {
        print("Enter a number : ")
        output(scala.io.StdIn.readInt())
    }

    def output(number:Int): Unit = {
        if (OddorEven(number) == "Even")
            println(s"Sum of all even numbers less than ${number} is ${sumOfAllEven(number - 2)}")
        else
            println(s"Sum of all even numbers less than ${number} is ${sumOfAllEven(number - 1)}")
    }
}
