class Account(accNumber: String, initialBalance: Double) {
    private var accountNumber: String = accNumber
    private var balance: Double = initialBalance

    def deposit(amount: Double): Unit = {
        if (amount > 0) {
            balance += amount
            println(s"$$${amount} Deposited to ${accountNumber}!\n")
        } else {
            println("Invalid Deposit Amount!")
        }
    }

    def withdraw(amount: Double): Unit = {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount
                println(s"$$${amount} Withdrawn from ${accountNumber}!\n")
            } else {
                println("Invalid Withdrawal Amount!")
            }
        } else {
            println("Insufficient Balance!")
        }
    }

    def transfer(amount: Double, acc: Account): Unit = {
        if (amount > 0) {
            if (amount <= balance) {
                withdraw(amount)
                acc.deposit(amount)
                println(s"$$${amount} Transfered from ${accountNumber} to ${acc.accountNumber}!\n")
            } else {
                println("Invalid Amount!")
            }
        } else {
            println("Insufficient Balance!")
        }
    }

    override def toString: String = s"Account Number: ${accountNumber}\nAccount Balance: $$${balance}\n"
}   

object Q3 {
    def main(args:Array[String]): Unit = {
        val account1 = new Account("A123",1000)
        val account2 = new Account("B321",500)

        println(account1)
        println(account2)
        account1.deposit(200)
        println(account1)
        account1.withdraw(100)
        println(account1)
        account1.transfer(300, account2)
        println(account1)
        println(account2)
    }
}
