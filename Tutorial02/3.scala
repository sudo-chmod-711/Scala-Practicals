object Main{
    def main(args:Array[String]): Unit = {
        var normalHours = 40
        var otHours = 30
        calcSalary(normalHours,otHours)
    }

    def normalPay(nHours:Int): Int = 250 * nHours

    def otPay(oHours:Int): Int = 85 * oHours

    def TAX(salary:Int)= salary * 0.12

    def calcSalary(N:Int,O:Int): Unit = {
        var sal = normalPay(N) + otPay(O)
        println(sal - TAX(sal))
    }

}