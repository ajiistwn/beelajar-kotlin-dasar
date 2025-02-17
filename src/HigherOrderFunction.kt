fun main(){
    fun hello(name: String, transformer: (String)-> String): String {
        val nameTransfior = transformer(name)

        return "Hello $nameTransfior"
    }

    val lambdaUpper = {value: String -> value.toUpperCase()}
    println(hello("Aji", lambdaUpper))
    println(hello("Setiawan") {value: String -> value.toUpperCase()}) //trailing lammbda
}