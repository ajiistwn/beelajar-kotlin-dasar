fun main(){
    var counter: Int = 0
    val lambdaIncreent: () -> Unit = {
        println("Increment")
        counter++
    }

    lambdaIncreent()
    println(counter)
    lambdaIncreent()
    println(counter)
    lambdaIncreent()
    println(counter)
    lambdaIncreent()
    println(counter)
}