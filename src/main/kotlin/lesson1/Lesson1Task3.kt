package lesson1

class Lesson1Task3 {
    val year: Int = 1961
    var hour: Int = 9
    var minute: Int = 7

    fun main() {
        println("Время полета Гагарина в космос: \n$year год \n$hour часов \n$minute минут")
        hour = 10
        minute = 55
        println("Время прибытия Гагарина из космоса(посадки): \n$year год \n$hour часов \n$minute минут")
    }
}