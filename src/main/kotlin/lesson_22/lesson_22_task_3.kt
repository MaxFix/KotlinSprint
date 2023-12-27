package lesson_22

fun main() {
    val sample = Experiment(12, "Example", "Red")

    val (id, title, color) = sample
    println("ID объекта: $id")
    println("Заголовок объекта: $title")
    println("Цвет объекта: $color")
}

data class Experiment(
    val id: Int,
    val title: String,
    val color: String,
)