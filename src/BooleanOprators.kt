fun main () {
    println(true && false)
    println(true || false)
    println(!true && false)

    val nilaiAbsen = 60
    val nilaiUjian = 89
    val nilaiExtra = 80

    val apakahLulusUjian = nilaiUjian > 75
    val apakahLulusAbsen = nilaiAbsen > 75
    val apakahLulusExtra = nilaiExtra > 75

    val apakahLulus = apakahLulusUjian && apakahLulusAbsen && apakahLulusExtra
    println(apakahLulus)

}