package lesson_22

fun main() {
    val sample = Experiment(12, "Example", "Red")

    println("ID объекта: ${sample.id}")
    println("Заголовок объекта: ${sample.title}")
    println("Цвет объекта: ${sample.color}")
}

data class Experiment(
    val id: Int,
    val title: String,
    val color: String,
)