package lesson_4

fun main() {
    var currentDay: Int = 1

    val armDay: String = "Упражнения для рук:"
    val legDay: String = "Упражнения для ног:"
    val backDay: String = "Упражнения для спины:"
    val pressDay: String = "Упражнения для пресса:"
    val firstGroup: Boolean = currentDay % 2 == 1
    val secondGroup: Boolean = currentDay % 2 == 0

    println("$armDay $firstGroup\n$legDay $secondGroup" +
            "\n$backDay $secondGroup\n$pressDay $firstGroup")
}