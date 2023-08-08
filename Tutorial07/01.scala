object Q1 {
    def main(args:Array[String]): Unit = {
        val list1 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        println(filterEvenNumbers(list1))
    }

    def filterEvenNumbers(arr: List[Int]): List[Int] = {
        arr.filter(num => num % 2 == 0)
    }
}
