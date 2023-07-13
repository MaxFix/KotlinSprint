package lesson_4

const val maxTables:Byte = 14
fun main() {
    val reservToday:Byte = 10
    var reservTomorrow:Byte = 15


    println("Доступность столиков на сегодня: ${reservToday < maxTables}, " +
            "\nДоступность столиков на завтра: ${reservTomorrow < maxTables}")
}