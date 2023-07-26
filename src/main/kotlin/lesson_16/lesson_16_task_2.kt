package lesson_16

import kotlin.math.pow

private const val PI: Double = 3.14

fun main() {
    val circle = Circle2(radius = 4.0)
    println("Длина окружности: ${circle.lengthOfCircle()}\nПлощадь окружности: ${circle.areaOfCircle()}")
}

class Circle2(
    private val radius: Double
) {
    fun lengthOfCircle(): Double = 2 * PI * radius

    fun areaOfCircle(): Double = 2 * PI * radius.pow(2)

}