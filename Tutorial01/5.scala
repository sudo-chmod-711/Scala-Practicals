object Q5 {
  def main(args:Array[String]): Unit = {
    println((CalcTime(2,8)+CalcTime(3,7)+CalcTime(2,8)))
  }

  def CalcTime(dist:Int,pace:Int)=dist*pace
}