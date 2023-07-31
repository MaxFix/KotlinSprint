package lesson_18

fun main() {
    val screen = Screen(2,15)

    val square = screen.draw("квадрат")
    val circle = screen.draw("круг")
    val dot = screen.draw("точка")

}

abstract class Figure(val x: Number, val y: Number) {
    open fun draw(figure: String) {}
}

class Screen(x: Number, y: Number) : Figure(x, y) {
    override fun draw(figure: String) {
        println("Рисуем фигуру $figure c координат $x и $y")
    }
}