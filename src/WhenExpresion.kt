fun main(){
    val finalExam = "C"

    when(finalExam){
        "A" -> println("Amazing")
        "B" -> println("Good")
        "C" -> println("Not Bad")
        "D" -> println("Bad")
        "E" -> println("Try Again Next Year")
        else -> println("Ups")
    }

    when(finalExam){
        "A", "B", "C" -> println("Selamat Anda Lulus")
        else -> println("Maaf Anda Tidak Lulus")
    }

    val passValue = arrayOf("A", "B")
    when(finalExam){
        in passValue -> println("Selamat Anda Lulus")
        !in passValue -> println("Maaf Anda Tidak Lulus")
    }

    val name = "Aji Setiawan"
    when(name){
        is String -> println("Name is String")
        !is String -> println("Name is not String")
    }

    val examValue = 100
    when{
        examValue > 75 -> println("Wahh")
        examValue < 75 -> println("Noo!")
        else -> println("Try Again")
    }
}