package lesson_2

import kotlin.math.pow

fun main() {
    val clientMoney: Int = 70_000
    val percents: Double =  16.7
    val years: Int = 20
    val finalSum = clientMoney * (1 + (percents / 100)).pow(years)
    println(String.format("%.3f", finalSum))
}