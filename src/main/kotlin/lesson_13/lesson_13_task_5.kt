package lesson_13

fun main() {
    val number: Long
    try {
        val strNumber = readlnOrNull().toString()
        number = strNumber.toLong()
    } catch (_: NumberFormatException) {
        println("Номер может содержать только цифры")
    }
}