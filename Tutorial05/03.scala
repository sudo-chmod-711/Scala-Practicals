object Q3 {
    def main(args:Array[String]): Unit = {
        getInput()
    }

    def sum(n: Int): Int = {
        if (n == 0)
            return 0
        else
            return (n + sum(n - 1))
    }

    def getInput(): Unit = {
        print("Enter a number : ")
        output(scala.io.StdIn.readInt())
    }

    def output(number:Int): Unit = {
        println(s"sum(${number}) = ${sum(number)}")
    }
}
