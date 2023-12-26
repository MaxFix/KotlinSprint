package lesson_21

fun main() {
    val number = 123456
    println(number.evenNumbersSum())
}

fun Int.evenNumbersSum(): Int {
    var sum = 0
    val convertedNumberToString = this.toString()
    for (i in convertedNumberToString) {
        if (i.digitToInt() % 2 == 0) {
            sum += i.digitToInt()
        }
    }
    return sum
}