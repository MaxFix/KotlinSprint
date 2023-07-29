package lesson_18

import kotlin.math.pow

fun main() {
    val cubPackage: CubPackage = CubPackage(12.0)
    val rectanglePackage: RectanglePackage = RectanglePackage(3.0, 4.6, 12.0)

    println(cubPackage.area())
    println(rectanglePackage.area())
}

abstract class Package {

    abstract fun area(): String
}

class CubPackage(
    private var a: Double,
): Package() {

    override fun area(): String = "Площадь коробки со стороной $a : ${6 * a.pow(2.0)}"
}

class RectanglePackage(
    private val a: Double,
    private val b: Double,
    private val h: Double,
): Package() {

    override fun area(): String = "Площадь коробки со сторонами $a, $b, $h : ${2 * (a * b + a * h + b * h)}"
}