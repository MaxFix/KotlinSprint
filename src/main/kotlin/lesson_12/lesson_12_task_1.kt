package lesson_12

fun main() {
    val weather1 = Weather()
    val weather2 = Weather()

    weather1.dayTemperature = 10
    weather1.nightTemperature = 1
    weather1.wasRaining = true
    weather1.atmospherePressure = 2000

    weather2.dayTemperature = 33
    weather2.nightTemperature = 11
    weather2.wasRaining = true
    weather2.atmospherePressure = 1000

    weather1.printWeatherData()
    println()
    weather2.printWeatherData()

}

class Weather {
    var dayTemperature = 22
    var nightTemperature = 12
    var wasRaining = false
    var atmospherePressure = 300

    fun printWeatherData() {
        println(dayTemperature)
        println(nightTemperature)
        println(wasRaining)
        println(atmospherePressure)
    }
    }