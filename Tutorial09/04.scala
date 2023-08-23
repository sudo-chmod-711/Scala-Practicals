class Account(accountNumber: String, initialBalance: Double) {
    private var accNum: String = accountNumber
    private var balance: Double = initialBalance

    def deposit(amount: Double) = balance += amount

    def withdraw(amount: Double) = balance -= amount

    def transfer(amount: Double, acc: Account): Unit = {
        withdraw(amount)
        acc.deposit(amount)
    }

    def getBalance() = balance

    override def toString: String = s"Account Number: ${accountNumber}\nAccount Balance: $$${balance}\n"
}

class Bank(accs: List[Account]) {
    private var accounts: List[Account] = accs

    def accountsWithNegativeBalances(): List[Account] = {
        accounts.filter(account => account.getBalance() < 0)
    }

    def calculateTotalBalance(): Double = {
        var sum: Double = 0.0
        accounts.map(account => {
          sum = sum + account.getBalance()
        })
        return sum
    } 

    def applyInterest(): Unit = {
        accounts.map (account => {
            if (account.getBalance() > 0) {
                account.deposit(account.getBalance() * 0.05)
            } else {
                account.deposit(account.getBalance() * 0.1)
            }
        })
    }

    def getAccounts() = accs
}

object Q4 {
  def main(args:Array[String]): Unit = {
    val account1 = new Account("A123", 500)
    val account2 = new Account("A124", -100)
    val account3 = new Account("B333", 200)
    val account4 = new Account("C555", -200)
    val account5 = new Account("C999", 300)


    val bank = new Bank(List(account1, account2, account3, account4, account5))

    println("Accounts With Negative Balances\n")
    bank.accountsWithNegativeBalances().map(account => 
        println(s"${account}")
    )

    println("_______________________________________")

    println(s"\nTotal Balance of All Accounts = $$${bank.calculateTotalBalance()}\n")
    
    println("_______________________________________")

    println("\nBalances After Applying Interest\n")
    bank.applyInterest()
    bank.getAccounts().map(account =>
        println(s"${account}")
    )
  }
} 