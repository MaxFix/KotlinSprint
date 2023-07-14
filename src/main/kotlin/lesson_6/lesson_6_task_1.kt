package lesson_6

fun main() {
    println("Предлагаю зарегистрироваться в системе")
    println("Введите свой потенциальный логин: ")
    val login: String = readln()
    println("Введите свой потенциальный пароль: ")
    val password: String = readln()

    var enteredLogin:String
    var enteredPassword:String

    do {
        println("Введите зарегистрированный ранее логин: ")
        enteredLogin = readln()
        println("Введите зарегистрированный ранее пароль: ")
        enteredPassword = readln()

        val incorrectLoginPassword = enteredLogin != login || enteredPassword != password
        if (incorrectLoginPassword) {
            println("Логин или пароль введены неверно")
        }
    } while (enteredLogin != login && enteredPassword != password)
}