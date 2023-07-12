package lesson_4

fun main() {
        var currentDay: Int = 1

        val armDay: String = "Упражнения для рук:"
        val legDay: String = "Упражнения для ног:"
        val backDay: String = "Упражнения для спины:"
        val pressDay: String = "Упражнения для пресса:"
        val group: Int = currentDay % 2

        println("$armDay ${group == 1}\n$legDay ${group == 0}" +
                "\n$backDay ${group == 0}\n$pressDay ${group == 1}")
}