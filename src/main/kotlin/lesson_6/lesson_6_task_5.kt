package lesson_6

import kotlin.random.Random

const val LOGIN = "abc"
const val PASSWORD = "bca"
const val WELCOME_TEXT = "Добро пожаловать! Для входа подтвердите сначала свою настоящесть, решите простой пример"
const val INCORRECT_ANSWER_TEXT = "Это неверно, повторите попытку"
fun main() {
    var enteredLogin: String
    var enteredPassword: String
    var counter = 0

    println(WELCOME_TEXT)
    do {
        val firstNumber: Int = Random.nextInt(10)
        val secondNumber: Int = Random.nextInt(10)
        val rightAnswer = firstNumber + secondNumber
        println("$firstNumber + $secondNumber = ")
        val userAnswer = readln().toInt()
        counter++
        if (userAnswer != rightAnswer || counter < 3) {
            println(INCORRECT_ANSWER_TEXT)
        } else if(counter == 3){
            println("Доступ запрещен")
        } else {
            println("Добро пожаловать!")
        }
    } while (userAnswer != rightAnswer || counter == 3)

    do {
        println("Введите зарегистрированный ранее логин: ")
        enteredLogin = readln()
        println("Введите зарегистрированный ранее пароль: ")
        enteredPassword = readln()

        val incorrectLoginPassword = enteredLogin != LOGIN || enteredPassword != PASSWORD
        if (incorrectLoginPassword) {
            println("Логин или пароль введены неверно")
        } else {
            println("Авторизация прошла успешно")
        }
    } while (incorrectLoginPassword)
}