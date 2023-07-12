package lesson_4

fun main() {
    var reservToday:Byte = 10
    var reservTomorrow:Byte = 15
    val maxTables:Byte = 14

    println("Доступность столиков на сегодня: ${reservToday < maxTables}, " +
            "\nДоступность столиков на завтра: ${reservTomorrow < maxTables}")
}