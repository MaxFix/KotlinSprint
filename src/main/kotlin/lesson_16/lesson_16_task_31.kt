package lesson_16

fun main() {
    val user = User3("test", "1234")
    println("Пароль надежен ${user.checkPassword()}")
}

class User3(
    val login: String,
    private val password: String,
) {
    fun checkPassword(): Boolean {
        return password.length > 4 && password.any { it.isDigit() }
    }
}