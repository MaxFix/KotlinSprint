package lesson_16

import kotlin.math.pow

fun main() {
    val circle = Circle2(radius = 4.0)
    println("Длина окружности: ${circle.lengthOfCircle()}\nПлощадь окружности: ${circle.areaOfCircle()}")
}

class Circle2(
    private val pi: Double = 3.14,
    private val radius: Double
) {

    fun lengthOfCircle(): Double {
        return 2 * pi * radius
    }

    fun areaOfCircle(): Double {
        return 2 * pi * radius.pow(2)
    }
}