fun sum(a: Int, b: Int): Int{
    return a + b
}

fun fullNamed(firstName: String = "", lastName: String = ""): String{
    return "$firstName $lastName"
}

fun main(){
    println(sum(10, 5))

    println( fullNamed("Aji", "Setiawan"))
}