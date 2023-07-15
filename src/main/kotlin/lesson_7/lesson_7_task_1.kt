package lesson_7

fun main() {
    var password: String = ""

    for (i in 1..3) {
        val randNumber = (0..9).random()
        val randSymbol = ('a'..'z').random()
        password += randSymbol
        password += randNumber
    }
    println(password)
}