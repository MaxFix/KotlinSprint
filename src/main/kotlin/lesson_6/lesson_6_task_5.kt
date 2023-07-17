package lesson_6

const val LOGIN = "abc"
const val PASSWORD = "bca"
const val WELCOME_TEXT = "Добро пожаловать! Для входа подтвердите сначала свою настоящесть, решите простой пример"
const val ACCESS_DENIED_TEXT = "Доступ запрещен"
const val WELCOME_SHORT_TEXT = "Добро пожаловать!"

const val ENTER_USER_LOGIN_TEXT = "Введите зарегистрированный ранее логин: "
const val ENTER_USER_PASSWORD_TEXT = "Введите зарегистрированный ранее пароль: "
const val LOGIN_OR_PASSWORD_IS_INCORRECT_TEXT = "Логин или пароль введены неверно"
const val AUTH_IS_CORRECT_TEXT = "Авторизация прошла успешно"
fun main() {
    var enteredLogin: String
    var enteredPassword: String
    var attempts = 3

    println(WELCOME_TEXT2)
    while (attempts > 0) {
        val num1 = (1..9).random()
        val num2 = (1..9).random()

        println("Решите пример: $num1 + $num2 = ")
        val answer = readln().toInt()

        if (answer == num1 + num2) {
            println(WELCOME_SHORT_TEXT)
            break
        } else {
            attempts--
            println("Ответ неверный. Осталось попыток: $attempts")
        }
    }
    if (attempts == 0) {
        println(ACCESS_DENIED_TEXT)
        return
    }

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