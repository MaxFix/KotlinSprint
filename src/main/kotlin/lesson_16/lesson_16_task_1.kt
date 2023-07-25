package lesson_16

fun main() {
    val throwCub = Cub()
    throwCub.generateRandomNumber()
}

internal class Cub(
    private val randomNumber: Int = (0..6).random(),
) {
    internal fun generateRandomNumber() {
        println(randomNumber)
    }
}