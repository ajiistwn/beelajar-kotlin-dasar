fun sayHello(firstName: String = "", lastName: String = ""){
    println("Hello $firstName $lastName")
}
fun main (){
    sayHello()
    sayHello("Aji")
    sayHello("Aji", "Setiawan")
    sayHello("", "Setiawan")
}