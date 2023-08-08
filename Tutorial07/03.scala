object Q3 {
    def main(args:Array[String]): Unit = {
        val list3 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        println(filterPrime(list3))
    }

    def filterPrime(arr: List[Int]): List[Int] = {
        arr.filter(isPrime)
    }

    def isPrime(n: Int): Boolean = {
      if (n <= 1)
        return false
      else if (n == 2)
        return true
      else 
        !(2 to (n - 1)).exists(x => n % x == 0)
    }
}
