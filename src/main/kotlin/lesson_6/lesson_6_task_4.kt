package lesson_6

const val WELCOME_TEXT = """Привет! Давай сыграем с тобой в ИГРУ!
    |Я загадаю число, от 1 до 9, а ты попробуешь отгадать
    |Напиши свой ответ: 
"""
const val SUCCESS_ANSWER_TEXT = "Это была великолепная игра!"
const val INCORRECT_ANSWER_TEXT = "Неверный ответ! Попробуй ещё раз"
fun main() {
    var numberOfAttempts = 0
    val randomNumber: Int = (1..9).random()
    println(WELCOME_TEXT.trimMargin())
    var userAnswer = readln().toInt()
    while (userAnswer != randomNumber && numberOfAttempts != 4) {
        println(INCORRECT_ANSWER_TEXT)
        userAnswer = readln().toInt()
        numberOfAttempts++
    }
    if (userAnswer == randomNumber) {
        println(SUCCESS_ANSWER_TEXT)
    } else {
        println("Попытки закончились.\nБыло загадано число $randomNumber")
    }
}