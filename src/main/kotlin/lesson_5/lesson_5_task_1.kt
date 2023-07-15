package lesson_5

const val WELCOME_MESSAGE2 = "Добро пожаловать!"
const val ACCESS_DENIED_MESSAGE = "Доступ запрещен."
fun main() {
    val expression: String = "2 + 3"
    val answer: Int = 5
    val question: String = "Здравствуйте! Введите ответ на выражение $expression = "

    println(question)
    var inputAnswer: Int = readln().toInt()
    if (inputAnswer == answer) {
        println(WELCOME_MESSAGE2)
    }
    else {
        println(ACCESS_DENIED_MESSAGE)
    }
}