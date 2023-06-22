object Main{
    def main(args:Array[String]): Unit = {
        var a = 2
        var b = 3
        var c = 4
        var d = 5
        var k = 4.3f

        // println(--b * a + c * d--);
        // println(a++);
        // println (-2 * ( g - k ) + c);
        // println(c=c++);
        // println(c=++c*a++);

        println("a) println( - -b * a + c *d - -); --> "+((b-1) * a + c * d));
        b=b-1;
        d=d-1;

        println("b) println(a++); --> "+(a));
        a=a+1;

        println("c) println (-2 * ( d - k ) +c); --> "+(-2*(d-k)+c));

        println("d) println (c=c++); --> "+(c));
        c=c+1

        println("e) println (c=++c*a++); --> "+(c+1)*a);
        a=a+1;
        c=c+1
  }

}