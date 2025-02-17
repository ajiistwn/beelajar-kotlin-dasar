fun String.hello(): String{
    return "Hello $this"
}

fun String.printHello(){
    println("Hello $this")
}

fun main(){
    val name = "Aji"
    println(name.hello())
    "Setiawan".printHello()
}