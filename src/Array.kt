fun main(){
    val names: Array<String> = arrayOf("Aji", "Setiawan", "Dev")
    val members: Array<String> = arrayOf("Aji", "Kurnia", "Jordan")
    val aji = members[0]
    val kurnia = members.get(1)

    members.set(0, "Ibnu")
    names[2] = "Base"

    println(names)
    println(members[0])
    println("$aji")
    println("$kurnia")

    val arrayNul = arrayOfNulls<String>(5)
    println(arrayNul[0])
    arrayNul[0] = "Aji"
    arrayNul[2] = "Aji"
    println(arrayNul[0])
    println(arrayNul.size)

}