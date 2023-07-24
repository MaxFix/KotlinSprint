package lesson_16

fun main() {
    println("Введите логин: ")
    val login = readln()
    println("Введите пароль: ")
    val password = readln()
    val user = User(login, password)
}

class User(

    private val login: String,
    private val password: String,
) {
    fun relevantPassword(inputPassword: String): Boolean {
        return inputPassword == password
    }
}