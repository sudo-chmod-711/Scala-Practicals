object Q2 {
    def main(args:Array[String]): Unit = {
        val list2 = List(1, 2, 3, 4, 5)
        println(calculateSquare(list2))
    }

    def calculateSquare(arr: List[Int]): List[Int] = {
        arr.map(i => i*i)
    }
}
