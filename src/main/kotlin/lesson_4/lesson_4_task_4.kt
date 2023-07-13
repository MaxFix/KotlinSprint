package lesson_4

fun main() {
        var currentDay: Int = 1

        val armDay: String = "Упражнения для рук:"
        val legDay: String = "Упражнения для ног:"
        val backDay: String = "Упражнения для спины:"
        val pressDay: String = "Упражнения для пресса:"
        val group: Boolean = currentDay % 2 == 1

        println("$armDay ${group}\n$legDay ${!group}" +
                "\n$backDay ${!group}\n$pressDay ${group}")
}