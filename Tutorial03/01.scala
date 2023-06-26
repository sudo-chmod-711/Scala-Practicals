object Main{
    def main(args:Array[String]): Unit = {
        getInput()
    }

    def reverse_string(str:String): Unit = {
        if (str.length() != 0) {
            var temp = str.charAt(0)
            reverse_string(str.substring(1))
            print(temp)
        } 
    }

    def getInput(): Unit = {
        print("Enter a string : ")
        val str1 = scala.io.StdIn.readLine()
        println("\nThe original string : " + str1)
        print("The reversed string : ")
        reverse_string(str1)
        println()
    }

}
