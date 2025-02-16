fun main () {
    val names = arrayOf("Jhon", "Jimy", "Daniel")
    var number = 0
    for (name in names) {
        println("$name - $number")
        number++
    }
    println("-------------")
    for(value in 0..100 step 3){
        println(value)
    }
    println("-------------")
    
    for(value in 100 downTo 0 step 5){
        println(value)
    }
}