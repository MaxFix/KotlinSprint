package lesson_14

import kotlin.math.pow
import kotlin.math.sqrt

private val pi = 3.14
fun main() {
    val whiteCircle = Circle("белый", 10.0)
    val redCircle = Circle("красный", 8.5)
    val blueRectangle = Rectangle("синий", 5.5, 9.0)
    val yellowRectangle = Rectangle("желтый", 4.3, 7.6)
    val pinkTriangle = Triangle("розовый", 2.0, 4.0, 7.0)
    val orangeTriangle = Triangle("оранжевый", 1.0, 5.0, 9.0)

    fun sumPerimeterRedFigures(figureList: List<Figure>) {
        var totalPerimeter = 0.0

        for (figure in figureList) {
            if (figure.color.lowercase() == "красный") totalPerimeter += figure.perimeter()
            else continue
        }
        println("Сумма периметров всех фигур: $totalPerimeter")
    }

    fun sumAreaRedFigures(figureList: List<Figure>) {
        var totalArea = 0.0
        for (figure in figureList) {
            if (figure.color.lowercase() == "красный") totalArea += figure.area()
            else continue
        }
        println("Сумма площадей всех фигур: $totalArea")
    }

    val figureList = listOf(whiteCircle, redCircle, blueRectangle, yellowRectangle, pinkTriangle, orangeTriangle)

    sumAreaRedFigures(figureList)
    sumPerimeterRedFigures(figureList)
}

abstract class Figure(
    val color: String,
) {
    abstract fun area(): Double

    abstract fun perimeter(): Double
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(
    color
) {
    override fun area(): Double {
        return pi * radius.pow(2)
    }

    override fun perimeter(): Double {
        return 2 * pi * radius
    }
}

class Rectangle(
    color: String,
    val width: Double,
    val height: Double,
) : Figure(
    color
) {
    override fun area(): Double {
        return width * height
    }

    override fun perimeter(): Double {
        return 2 * (width + height)
    }

}

class Triangle(
    color: String,
    val firstLength: Double,
    val secondLength: Double,
    val thirdLength: Double,
) : Figure(
    color
) {
    override fun area(): Double {
        val p = perimeter() / 2
        return sqrt(p * (p - firstLength) * (p - secondLength) * (p - thirdLength))
    }

    override fun perimeter(): Double {
        return firstLength + secondLength + thirdLength
    }
}