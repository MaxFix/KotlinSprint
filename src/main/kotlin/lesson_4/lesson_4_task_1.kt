package lesson_4

const val MAX_TABLES:Byte = 14
const val RESERV_TODAY:Byte = 10
fun main() {
    val reservTomorrow:Byte = 15

    println("Доступность столиков на сегодня: ${RESERV_TODAY < MAX_TABLES}, " +
            "\nДоступность столиков на завтра: ${reservTomorrow < MAX_TABLES}")
}