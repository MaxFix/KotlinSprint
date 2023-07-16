package lesson_7

fun main() {
    var code = (1000..9999).random()

    println("Ваш код авторизации: $code")
    println("Введите код авторизации:")

    var userCode = readln().toInt()
    while (userCode != code) {
        println("Попробуйте снова")
        code = (1000..9999).random()
        println("Ваш код авторизации: $code")
        userCode = readln().toInt()
    }
    println("Добро пожаловать!")
}