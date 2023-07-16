package lesson_6

const val WELCOME_TEXT2 = """Привет! Давай сыграем с тобой в ИГРУ!
    |Я загадаю число, от 1 до 9, а ты попробуешь отгадать
    |Напиши свой ответ: 
"""
const val SUCCESS_ANSWER_TEXT = "Это была великолепная игра!"
const val INCORRECT_ANSWER_TEXT = "Неверный ответ! Попробуй ещё раз"
const val NUMBER_OF_ATTEMPTS = 5

fun main() {
    val randomNumber: Int = (1..9).random()
    println(WELCOME_TEXT2.trimMargin())
    var userAnswer = readln().toInt()

    repeat(NUMBER_OF_ATTEMPTS - 1) {
        if (userAnswer != randomNumber) {
            println(INCORRECT_ANSWER_TEXT)
            userAnswer = readln().toInt()
        }
    }

    if (userAnswer == randomNumber) {
        println(SUCCESS_ANSWER_TEXT)
    } else {
        println("Попытки закончились.\nБыло загадано число $randomNumber")
    }
}