package lesson_17

fun main() {
    val user = User2("login", "password")
    println(user.password)
    user.password = "test"
    user.login = "test"
}

class User2(
    login: String,
    password: String,
) {
    private var rPassword: String = password
    var password: String = password
        get() = "*".repeat(rPassword.length)
        set(value) {
            field = value
            println("Вы не можете изменить пароль")
        }

    var login: String = login
        set(value) {
            field = value
            println("Логин изменен успешно")
        }
}