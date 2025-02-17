fun choiceIfHello(name:String=""): String{
    return if (name === ""){
        "Hello Bro"
    } else {
        "Hello $name"
    }
}

fun choiceWhenHello(name: String=""): String{
    return when{
        name == "" -> "Hello Bro"
        name.length > 0 -> "Hello $name"
        else -> "Hello"
    }
}

fun main(){
    println(choiceIfHello())
    println(choiceIfHello("AJi"))
    println(choiceWhenHello())
}