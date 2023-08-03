package lesson_18


fun main() {
    val screen = Screen()
    val dot = Dot(3, 5)
    val square = Square(dot, 12)
    val circle = Circle(dot, 9)

    screen.draw(dot)
    screen.draw(square)
    screen.draw(circle)
}

abstract class Figure {
    abstract fun draw()
}

class Square(private val leftTop: Dot, private val sideLenght: Number) : Figure() {
    override fun draw() {
        println(
            "Рисуем квадрат с начальной координатой ${leftTop.x}, ${leftTop.y} " +
                    "и длиной стороны $sideLenght"
        )
    }
}

class Circle(private val center: Dot, private val radius: Number) : Figure() {
    override fun draw() {
        println("Рисуем круг с центром в точке ${center.x}, ${center.y} и радиусом $radius")
    }
}

class Dot(val x: Number, val y: Number) : Figure() {
    override fun draw() {
        println("Рисуем точку по координатам $x, $y")
    }
}

class Screen {
    fun draw(figure: Figure) {
        figure.draw()
    }
}