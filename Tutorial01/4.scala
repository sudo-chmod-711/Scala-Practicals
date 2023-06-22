object Q4 {
  def main(args:Array[String]): Unit = {
    println((BookPrice(60)-Discount(BookPrice(60))+ShippingCost(60)))
  }

  def BookPrice(x:Int)=24.95*x
  def Discount(y:Double)=y*40/100
  def ShippingCost(z:Int)=3+((z-50)*.75)
}