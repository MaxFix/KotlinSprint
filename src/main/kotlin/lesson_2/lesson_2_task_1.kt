package lesson_2

fun main() {
    val firstStudent: Byte = 3
    val secondStudent: Byte = 4
    val thirdStudent: Byte = 3
    val fourthStudent: Byte = 5
    val sum: Double = (firstStudent + secondStudent +
            thirdStudent + fourthStudent).toDouble() / 4
    println(sum)
}