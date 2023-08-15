object Q1 {
  def main(args: Array[String]): Unit = {
    functionofInterest()
  }

  def functionofInterest(): Unit = {
    val depositAmount = getInput()

    if (amountChecker(depositAmount)) {
      val returnInterest = calcInterest(depositAmount, calcInterestRate(depositAmount))
      val finalAmount = calcTotal(depositAmount, returnInterest)

      println()
      println("Amount Deposit\t: " + depositAmount)
      println("Return Interest\t: " + returnInterest)
      println("Final Amount\t: " + finalAmount)
    } else {
      println()
      println("Invalid amount of money!")
    }
  }

  def getInput(): Double = {
    print("Enter the deposit amount : ")
    scala.io.StdIn.readDouble()
  }

  val calcInterestRate: Double => Double = {
    case amount if amount > 20000000 => 0.065
    case amount if amount > 2000000 => 0.035
    case amount if amount > 200000 => 0.04
    case _ => 0.02
  }

  val amountChecker: Double => Boolean = (amount) => (amount >= 0.0)

  val calcInterest: (Double, Double) => Double = (amount, interestRate) => (amount * interestRate)

  val calcTotal: (Double, Double) => Double = (amount, interest) => (amount + interest)
}
