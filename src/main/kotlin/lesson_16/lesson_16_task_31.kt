package lesson_16

fun main() {
    val user = User3("test", "12345")
    user.checkPassword()
}

class User3(
    val login: String,
    private val password: String,
) {
    fun checkPassword() {
        if(password.length > 4 && password.any{it.isDigit()}) {
            println("Пароль надежен")
        } else {
            println("Пароль НЕНАДЁЖЕН")
        }
    }
}