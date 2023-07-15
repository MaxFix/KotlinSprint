package lesson_7

fun main() {
    var code = ""
    for (i in 1..4) {
        val randNumber = (0..9).random()
        code += randNumber
    }

    println("Ваш код авторизации: $code")
    println("Введите код авторизации:")

    var userCode = readln()
    while (userCode != code) {
        code = ""
        println("Попробуйте снова")
        for (i in 1..4) {
            val randNumber = (0..9).random()
            code += randNumber
        }
        println("Ваш код авторизации: $code")
        userCode = readln()
    }
    println("Добро пожаловать!")
}