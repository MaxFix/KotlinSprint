package lesson_5

fun main() {
    val answer: Int = 5
    val question: String = "Здравствуйте! Введите ответ на выражение 2 + 3 = "

    println(question)
    var inputAnswer: Int = readln().toInt()
    if (inputAnswer == answer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}