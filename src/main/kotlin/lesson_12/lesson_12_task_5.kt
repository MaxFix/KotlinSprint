package lesson_12

import kotlin.random.Random

const val COUNT_OF_DAYS = 10

fun main() {
    val listOfDaysWeather: MutableList<Weather5> = mutableListOf()
    val middleDayTemperature: MutableList<Int> = mutableListOf()
    val middleNightTemperature: MutableList<Int> = mutableListOf()
    val middleAtmospherePressure: MutableList<Int> = mutableListOf()
    val wasRainingCount: MutableList<Int> = mutableListOf()

    for (i in (1..COUNT_OF_DAYS) ) {
        listOfDaysWeather += Weather5((0..35).random(),(-10..15).random(),
            Random.nextBoolean() ,(1000..2500).random() )
    }

    listOfDaysWeather.forEach{
        middleDayTemperature.add(it.dayTemperature)
        middleNightTemperature.add(it.nightTemperature)
        middleAtmospherePressure.add(it.atmospherePressure)
        if (it.wasRaining) {
            wasRainingCount += 1
        }
    }

    println("Средняя дневная температура за $COUNT_OF_DAYS дней: ${middleDayTemperature.average()}")
    println("Средняя ночная температура за $COUNT_OF_DAYS дней: ${middleNightTemperature.average()}")
    println("Среднее давление за $COUNT_OF_DAYS дней: ${middleAtmospherePressure.average()}")
    println("Количество дождливых дней за $COUNT_OF_DAYS дней: ${wasRainingCount.average()}")
}

class Weather5(
    val dayTemperature: Int = 12,
    val nightTemperature: Int = 6,
    val wasRaining: Boolean = false,
    val atmospherePressure: Int = 2000
)