package lesson_18

import kotlin.math.pow

fun main() {
    val package1 = Package()
    println(package1.area(5.0))
    println(package1.area(2,5,5))
}

open class Package {

    fun area(a: Int, b: Int, h: Int): Int {
        return 2 * (a * b + a * h + b * h)
    }

    fun area(a: Double): Double {
        return 6 * a.pow(2.0)
    }
}