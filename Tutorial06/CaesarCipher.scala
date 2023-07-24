object CaesarCipher {
    def main(args: Array[String]): Unit = {
        getInput()
    }

    def getInput(): Unit = {
        print("Enter a text : ")
        val text = scala.io.StdIn.readLine()

        var key = 0
        var condition = true
        while(condition){
            print("Enter the key (0 - 25) : ")
            key = scala.io.StdIn.readInt()
            if ((key > -1) & (key < 26)) {
                condition = false
            }
            if (condition) print("Invalid Key! : Re ")
        }
        output(text, key)
    }

    def output(text : String, key : Int): Unit = {
        val encryptedText = Cipher(Encryption, text, key)
        val decryptedText = Cipher(Decryption, encryptedText, key)
        println()
        println("The Original String : " + text )
        println("The Encrypted String : " + encryptedText)
        println("The Decrypted String : " + decryptedText)
    }

    def Encryption(str : String, key : Int) : String = {
        var output = ""
        for (ch <- str) {
            val base = if (ch.isUpper) 'A' else 'a'
            output += ((((ch - base) + key) % 26) + base).toChar
        }
        return output
    }

    def Decryption(str : String, key : Int) : String = {
        var output = ""
        for (ch <- str) {
            val base = if (ch.isUpper) 'A' else 'a'                                    
            output += ((((ch - base) + (26 - key)) % 26) + base).toChar
        }
        return output
    }

    def Cipher(Func : (String, Int) => String, str : String, key : Int) : String = {
        return Func(str, key)
    }
  
}
