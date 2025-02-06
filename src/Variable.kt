import java.lang.Runtime.Version

const val APPLICATION = "Belajar kotlin"
    const val VERSION = "0.0.1"
fun main(){
    val firsName = "Aji"
    val lastName = "Setiawan"
    var fullName = "$firsName $lastName"

    val name:String? = null
    val name2:String?

    println(fullName)
    println(name)
    println(name?.length)
//    println(name2)
    println("$APPLICATION : $VERSION")
}