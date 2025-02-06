fun main(){
    val range = 100 downTo 1 step 3
    println(range.count())
    println(range.contains(50))
    println(range.first)
    println(range.last)
    println(range.step)
}