package lesson1

import kotlin.math.min

class Lesson1Task5 {
    fun main() {
        val seconds: Int = 6480
        val minutes: Int = seconds / 60
        val remainder: Int = seconds % 60
        println(String.format("%02d:%02d", minutes,remainder))
    }
}