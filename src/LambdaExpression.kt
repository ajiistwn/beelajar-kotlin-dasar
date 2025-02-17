fun toUpper(value: String): String = value.toUpperCase()

fun main(){
    val contohLambda: (String, String) -> String = {firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }
    val contohLambdaSayHello: (String) -> String = {
        "Hello $it"
    }

    val toUpperNew: (String) -> String = ::toUpper

    println(contohLambdaSayHello("Aji"))
    println(contohLambda("AJi", "Setiawan"))
    println(toUpperNew("Setiawan"))
}