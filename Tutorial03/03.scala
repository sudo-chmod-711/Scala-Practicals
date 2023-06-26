object Main{
    def main(args:Array[String]): Unit = {
        println(avarage())
    }

    def avarage(): Float = {
        print("Enter numb1 : ")
        var num1 = scala.io.StdIn.readFloat()
        print("Enter num2 : ")
        var num2 = scala.io.StdIn.readFloat()

        var avg:Float = (num1 + num2)/2
        return avg
    }
}