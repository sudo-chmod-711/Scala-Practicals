object Q1{
    def main(args:Array[String]): Unit = {
        functionofInterest()
    }

    def functionofInterest(): Unit = {
        val depositAmount = getInput()

        if (amountChecker(depositAmount)){
            val returnInterest = calcInterest(depositAmount, calcInterestRate(depositAmount))
            val finalAmount = calcTotal(depositAmount, returnInterest)

            println()
            println("Amount Deposit\t: " + depositAmount)
            println("Return Interest\t: " + returnInterest)
            println("Final Amount\t: " + finalAmount)
        }
        else {
            println()
            println("Invalid amount of money!")
        }
    }

    def getInput(): Double = {
        print("Enter the deposit amount : ")
        return scala.io.StdIn.readDouble()
    }

    def amountChecker(amount:Double): Boolean = {
        if (amount < 0.0)
            false
        else
            true
    }

    def calcInterestRate(amount:Double): Double = {
        var interestRate = 0.0
        if (amount > 20000000)
            interestRate = 0.065
        else if (amount > 2000000)
            interestRate = 0.035
        else if (amount > 200000)
            interestRate = 0.04
        else
            interestRate = 0.02
        return interestRate
    }

    def calcInterest(amount:Double, interestRate:Double): Double = amount * interestRate

    def calcTotal(amount:Double, interest:Double): Double = amount + interest
        
}