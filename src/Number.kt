fun main(){
    var age: Byte = 30
    var height: Int = 200
    var distance: Short = 2000
    var balance: Long = 9_000_000_000L

    var balanceInt: Int = balance.toInt()

    var sampleFloat: Float = 10.10F
    var sampleDouble: Double = 10.10

    var decimal: Int = 100
    var hexadecimal: Int = 0xFF
    var binaryLiteral: Int = 0b0001110

    println("age: " + age)
    println("height: " + height)
    println("distance: " + distance)
    println("long: " + balance)
    println("-------------")
    println("samplefloat: " + sampleFloat)
    println("sampleDouble: " + sampleDouble)
    println("-------------")
    println("decimal: " + decimal)
    println("hexadecimal: " + hexadecimal)
    println("binaryLiteral: " + binaryLiteral)
    println("--------------")
    println("balanceInt: " + balanceInt)

}