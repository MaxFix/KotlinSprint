package lesson_12

fun main() {
    val monday = Weather3(25, 10, atmospherePressure = 1200)
    val tuesday = Weather3(10, 9, true, 500)
    val wednesday = Weather3(13, 14, atmospherePressure = 1460)
    val thursday = Weather3(23, 5, true, 1660)
    val friday = Weather3(14, 4, atmospherePressure = 1260)

    println("Понедельник")
    monday.printWeatherClassData()
    println("Вторник")
    tuesday.printWeatherClassData()
    println("Среда")
    wednesday.printWeatherClassData()
    println("Четверг")
    thursday.printWeatherClassData()
    println("Пятница")
    friday.printWeatherClassData()
}

class Weather3(
    private val dayTemperature: Int,
    private val nightTemperature: Int,
    private val wasRaining: Boolean = false,
    val atmospherePressure: Int
) {

    fun printWeatherClassData() {
        println(dayTemperature)
        println(nightTemperature)
        println(wasRaining)
        println(atmospherePressure)
    }
}