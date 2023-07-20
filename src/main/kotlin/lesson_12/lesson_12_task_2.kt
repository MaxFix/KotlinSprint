package lesson_12

fun main() {
    val weather1 = Weather2()
    val weather2 = Weather2(10, 9, true, 500)
    val weather3 = Weather2(100, 90, atmospherePressure = 1560)

    weather1.printWeatherClassData()
    println()
    weather2.printWeatherClassData()
    println()
    weather3.printWeatherClassData()
}

class Weather2(
    val dayTemperature: Int = 12,
    val nightTemperature: Int = 10,
    val wasRaining: Boolean = false,
    val atmospherePressure: Int = 1200) {

fun printWeatherClassData() {
        println(dayTemperature)
        println(nightTemperature)
        println(wasRaining)
        println(atmospherePressure)
    }
}