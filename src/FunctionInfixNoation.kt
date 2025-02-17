infix fun String.to(type: String): String{
    if(type === "UP"){
        return this.toUpperCase()
    } else {
        return this.toLowerCase()
    }
}

infix fun Int.plus(value: Int ): Int{
    return this + value
}

fun main(){
    println("Aji" to "UP")
    println(2 plus 2)
}