fun main(){
    fun hello(name: String, transformer: (String)-> String): String {
        val nameTransfior = transformer(name)

        return "Hello $nameTransfior"
    }

    val anonymousUpper = fun(value:String): String{
        if (value.isBlank()){
            return "Ups"
        }
        return value.toUpperCase()
    }

    val result1 = hello("Aji", anonymousUpper)
    println(result1)

    println(hello("SetiAwan", fun (value: String): String{
        return value.toLowerCase()
    }))
}