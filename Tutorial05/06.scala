object Q6 {
    def main(args:Array[String]): Unit = {
        getInput()
    }

    def fibonacci(n: Int): Int = {
        if (n == 1)
            return 0
        else if (n == 2)
            return 1
        else
            return fibonacci(n - 1) + fibonacci(n - 2)
    }

    def getInput(): Unit = {
        print("Enter a number : ")
        output(scala.io.StdIn.readInt())
    }

    def output(number:Int): Unit = {
        for (i <- 1 to number){
            print(s"${fibonacci(i)} ")
        }
        println()
    }
}
