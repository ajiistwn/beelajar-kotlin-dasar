import javax.tools.Tool

fun display1(value:Int){
    println("Recursive $value")
    if (value > 0){
        display1(value - 1)
    }
}

tailrec fun display2(value:Int){
    println("Recursive $value")
    if (value > 0){
        display2(value - 1)
    }
}

tailrec fun factorialRecursive2(value: Int, total: Int = 1): Int{
    return when (value){
        1 -> total
        else -> factorialRecursive2(value - 1, total * value)
    }
}

fun main(){
//    display1(10_000) //error stackoverflow
//    display2(100_000)
    println(factorialRecursive2(10))
}
