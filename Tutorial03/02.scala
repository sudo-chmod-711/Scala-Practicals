object Main{
    def main(args:Array[String]): Unit = {
        var list = func(getInput())
        println("\n" + list)
    
    }

    def func(str_list:List[String]): List[String] = {
        var output = List.empty[String]
        for (i <- str_list) {
            if (i.length() > 5){
                output = i :: output
            }
        }
        return output
    }

    def getInput(): List[String] = {
        print("Enter the number of strings you going to input : ")
        var n = scala.io.StdIn.readInt()
        var input = List.empty[String]
        for (i <- 1 to n){
            var temp : String = ""
            if (i == 1) {
                print("Enter the first string : ")
                temp = scala.io.StdIn.readLine()
            } else if (i == n) {
                print("Enter the last string : ")
                temp = scala.io.StdIn.readLine()
            } else {
                print("Enter the next string : ")
                temp = scala.io.StdIn.readLine()
            }
            input = input :+ temp
        }
        return input
    }
}