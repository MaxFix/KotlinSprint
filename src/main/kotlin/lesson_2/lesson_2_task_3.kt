package lesson_2

fun main() {
    val departureTimeHour: Int = 9
    val departureTimeMinute: Int = 39
    val travelTime: Int = 457

    val departureTimeMinuteConvert: Int = departureTimeHour * 60 + departureTimeMinute
    val arrivalTimeMinute: Int = departureTimeMinuteConvert + travelTime

    println("Время прибытия поезда ${arrivalTimeMinute/60} часов и ${arrivalTimeMinute%60} минут")
}