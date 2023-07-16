package lesson_7

fun main() {
    println("Здравствуйте! Введите длинну желаемого пароля:")
    val passwordLength = readln().toInt()
    val charset = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    var password = ""
    for(i in 1..passwordLength) {
        password += charset.random()
    }
    println("Ваш пароль: $password")
}