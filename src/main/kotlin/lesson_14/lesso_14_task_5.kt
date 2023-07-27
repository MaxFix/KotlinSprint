package lesson_14

import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.math.PI

const val WHITE = "белый"
const val RED = "красный"
const val BLUE = "синий"
const val YELLOW = "жёлтый"
const val PINK = "розовый"
const val ORANGE = "оранжевый"
fun main() {
    val whiteCircle = Circle(WHITE, 10.0)
    val redCircle = Circle(RED, 8.5)
    val blueRectangle = Rectangle(BLUE, 5.5, 9.0)
    val yellowRectangle = Rectangle(YELLOW, 4.3, 7.6)
    val pinkTriangle = Triangle(PINK, 2.0, 4.0, 7.0)
    val orangeTriangle = Triangle(ORANGE, 1.0, 5.0, 9.0)

    fun sumPerimeterRedFigures(figureList: List<Figure>) {
        var totalPerimeter = 0.0

        for (figure in figureList) {
            if (figure.color.lowercase() == RED) totalPerimeter += figure.perimeter()
            else continue
        }
        println("Сумма периметров всех фигур: $totalPerimeter")
    }

    fun sumAreaRedFigures(figureList: List<Figure>) {
        var totalArea = 0.0
        val redFigures = figureList.filter {
            it.color.lowercase() == RED
        }

        for (figure in redFigures) {
            totalArea += figure.area()
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
    private val radius: Double,
) : Figure(color) {
    override fun area(): Double {
        return PI * radius.pow(2)
    }

    override fun perimeter(): Double {
        return 2 * PI * radius
    }
}

class Rectangle(
    color: String,
    private val width: Double,
    private val height: Double,
) : Figure(color) {
    override fun area(): Double {
        return width * height
    }

    override fun perimeter(): Double {
        return 2 * (width + height)
    }

}

class Triangle(
    color: String,
    private val firstLength: Double,
    private val secondLength: Double,
    private val thirdLength: Double,
) : Figure(color) {
    override fun area(): Double {
        val p = perimeter() / 2
        return sqrt(p * (p - firstLength) * (p - secondLength) * (p - thirdLength))
    }

    override fun perimeter(): Double {
        return firstLength + secondLength + thirdLength
    }
}