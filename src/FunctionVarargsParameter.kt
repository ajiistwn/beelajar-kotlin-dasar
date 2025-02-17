fun finalValue(name: String, vararg values: Int){
    var total = 0.0
    for(value in values){
        total+= value
    }
    total /= values.size
    println("Final Value $name = $total")
}

fun main(){
    finalValue("Gambar", 1,5,2,2)
}