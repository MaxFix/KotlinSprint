package lesson_12

fun main() {
    Weather4(25,10, atmospherePressure = 1200)
    println()
    Weather4(10, 9, true, 500)
}

class Weather4(
    private val dayTemperature: Int = 12,
    private val nightTemperature: Int = 6,
    private val wasRaining: Boolean = false,
    val atmospherePressure: Int = 2000) {

    init {
        printWeatherClassData()
    }

    fun printWeatherClassData() {
        println(dayTemperature)
        println(nightTemperature)
        println(wasRaining)
        println(atmospherePressure)
    }
}