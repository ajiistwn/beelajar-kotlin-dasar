fun main(){
    var firsName: String = "Aji"
    var lastName: String = "Setiawan"
    var fullName: String = firsName + " " +lastName
    var fullNameNew: String = "$firsName $lastName"
    var desc:  String = "total $fullNameNew char = ${fullNameNew.length}"
    var address: String = """
        |Gg Adam Rt 10 Rw 03 Kel Tugu Kec Cimanggis
        |Kota Depok
        |Jawa Barat
        |Indonesia
    """.trimMargin()

    println(firsName)
    println(lastName)
    println(fullName)
    println(desc)
    println(address)
}