package lesson_7

fun main() {
    println("Здравствуйте! Введите длинну желаемого пароля:")
    val passwordLength = readln().toInt()
    val charset = "ABCDEFGHIJKLMNOPQRSTUVWXTZabcdefghiklmnopqrstuvwxyz0123456789"
    var password = ""
    for(i in 1..passwordLength) {
        password += charset.random()
    }
    println("Ваш пароль: $password")
}