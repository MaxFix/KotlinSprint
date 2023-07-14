package lesson_6

import kotlin.random.Random

const val LOGIN = "abc"
const val PASSWORD = "bca"
const val WELCOME_TEXT = "Добро пожаловать! Для входа подтвердите сначала свою настоящесть, решите простой пример"
const val INCORRECT_ANSWER_TEXT = "Это неверно, повторите попытку"
const val ACCESS_DENIED_TEXT = "Доступ запрещен"
const val WELCOME_SHORT_TEXT = "Добро пожаловать!"

const val ENTER_USER_LOGIN_TEXT = "Введите зарегистрированный ранее логин: "
const val ENTER_USER_PASSWORD_TEXT = "Введите зарегистрированный ранее пароль: "
const val LOGIN_OR_PASSWORD_IS_INCORRECT_TEXT = "Логин или пароль введены неверно"
const val AUTH_IS_CORRECT_TEXT = "Авторизация прошла успешно"
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
            println(ACCESS_DENIED_TEXT)
        } else {
            println(WELCOME_SHORT_TEXT)
        }
    } while (userAnswer != rightAnswer || counter == 3)

    do {
        println(ENTER_USER_LOGIN_TEXT)
        enteredLogin = readln()
        println(ENTER_USER_PASSWORD_TEXT)
        enteredPassword = readln()

        val incorrectLoginPassword = enteredLogin != LOGIN || enteredPassword != PASSWORD
        if (incorrectLoginPassword) {
            println(LOGIN_OR_PASSWORD_IS_INCORRECT_TEXT)
        } else {
            println(AUTH_IS_CORRECT_TEXT)
        }
    } while (incorrectLoginPassword)
}