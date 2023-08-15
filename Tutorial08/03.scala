object Q3 {
    def main(args:Array[String]): Unit = {
        formatter()
    }

    def formatter(): Unit = {
        println(formatNames("Benny", toUpper))
        println(formatNames("Ni", toUpper) + "roshan")
        println(formatNames("Saman", toLower))
        println("Kumar" + formatNames("a", toUpper))
    }

    val toUpper: String => String = str => str.toUpperCase()

    val toLower: String => String = str => str.toLowerCase()

    val formatNames: (String, String => String) => String = (name, formatName) => formatName(name)

}