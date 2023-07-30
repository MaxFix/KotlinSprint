package lesson_18

fun main() {
    val screen = Screen()
    val square = Square(Dot(2, 14), 13)
    val circle = Circle(Dot(3, 12), 3)
    val dot = Dot(13, 4)

    screen.draw(square)
    screen.draw(circle)
    screen.draw(dot)
}

class Square(val leftTop: Dot, val sideLenght: Number)

class Circle(val center: Dot, val radius: Number)

class Dot(val x: Number, val y: Number)

class Screen {
    fun draw(square: Square) {
        println(
            "Рисуем квадрат с начальной координатой ${square.leftTop.x}, ${square.leftTop.y} " +
                    "и длиной стороны ${square.sideLenght}"
        )
    }

    fun draw(circle: Circle) {
        println("Рисуем круг с центром в точке ${circle.center.x}, ${circle.center.y} и радиусом ${circle.radius}")
    }

    fun draw(dot: Dot) {
        println("Рисуем точку по координатам ${dot.x}, ${dot.y}")
    }
}

