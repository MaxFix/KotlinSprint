package lesson_12

import kotlin.random.Random

const val COUNT_OF_DAYS = 10

fun main() {
    val classObjects: MutableList<Weather5> = mutableListOf()
    var middleDayTemperature = 0
    var middleNightTemperature = 0
    var middleAtmospherePressure = 0
    var wasRainingCount = 0

    for (i in (1..COUNT_OF_DAYS) ) {
        classObjects += Weather5((0..35).random(),(-10..15).random(),
            Random.nextBoolean() ,(1000..2500).random() )
    }

    classObjects.forEach{
        middleDayTemperature += it.dayTemperature
        middleNightTemperature += it.nightTemperature
        middleAtmospherePressure += it.atmospherePressure
        if (it.wasRaining) {
            wasRainingCount += 1
        }
    }

    println("Средняя дневная температура за $COUNT_OF_DAYS дней: ${middleDayTemperature / COUNT_OF_DAYS}")
    println("Средняя ночная температура за $COUNT_OF_DAYS дней: ${middleNightTemperature / COUNT_OF_DAYS}")
    println("Среднее давление за $COUNT_OF_DAYS дней: ${middleNightTemperature / COUNT_OF_DAYS}")
    println("Количество дождливых дней за $COUNT_OF_DAYS дней: ${middleNightTemperature / COUNT_OF_DAYS}")
}

class Weather5(
    val dayTemperature: Int = 12,
    val nightTemperature: Int = 6,
    val wasRaining: Boolean = false,
    val atmospherePressure: Int = 2000
)