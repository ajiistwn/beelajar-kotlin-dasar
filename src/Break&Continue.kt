fun main (){
    var i = 0
    while (true){
        i++
        if(i % 2 == 0){
            continue
        }
        if (i > 10){
            break
        }
        println(i)
    }
}