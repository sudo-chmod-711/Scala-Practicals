object Q1 {
    def main(args:Array[String]): Unit = {
        getInput()
    }

    def prime(n: Int, m: Int  = 2): Boolean = {
        if (n == m)
            return true
        else if (n % m == 0)
            return false
        else
            return prime(n, m + 1)
    }

    def getInput(): Unit = {
        print("Enter a number : ")
        output(scala.io.StdIn.readInt())
    }

    def output(number:Int): Unit = {
        println(s"prime(${number}) = ${prime(number)}")
    }
}
