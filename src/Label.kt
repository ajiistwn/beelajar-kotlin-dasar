fun main(){
//    loopI@ for (i in 1..10){
//        loopJ@ for (j in 1..10){
//            println("$i * $j = ${i * j}")
//            if (j == 5){
//                continue@loopI
//            }
//            if (i == 8){
//                break@loopI
//            }
//
//        }
//    }

    fun test(name: String, operation: (String) -> Unit): Unit = operation(name)

    test("Aji") test@{
        if (it == "") {
            return@test
        } else {
            println("Aji")
        }
    }
}