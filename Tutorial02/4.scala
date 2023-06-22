object Main{
    def main(args:Array[String]): Unit = {
        // 15 --> 120
        // 10 --> 140
        // 5 --> 160
        // 20 --> 100
        // 25 --> 80
        // 30 --> 60
        // 35 --> 40
        // 40 -- > 20
        var Price, max_price = 5
        var attend, max_attend = 160
        var max = 0

        while(attend >= 20){
            var Profit = profit(Price,attend)
            println(Profit)
            if (Profit > max){
                max = Profit
                max_price = Price
                max_attend = attend
            }
            Price += 5
            attend -= 20
        }

        print("Highest profit = ")
        println(max)
        print("Ticket price = ")
        println(max_price)
        print("Attendence = ")
        println(max_attend)

    }

    def totalCost(seat:Int)= 500 + (seat * 3)

    def totalIncome(price:Int,seat:Int)= price * seat

    def profit(price:Int,seat:Int): Int = {
        var income = totalIncome(price,seat)
        var cost = totalCost(seat)
        return (income - cost)
    }
}