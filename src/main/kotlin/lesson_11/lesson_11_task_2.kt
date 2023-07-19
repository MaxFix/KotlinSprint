package lesson_11

fun main() {
    val userVasa = User(123, "Vasa", "qwerty", "vasa@br.com", "test")
    val userUri = User(321, "Uri", "strew", "ura@grade.uk", "test2")

    userVasa.printUserData(userVasa.id, userVasa.login, userVasa.password, userVasa.email, userVasa.bio)
    userUri.printUserData(userUri.id, userUri.login, userUri.password, userUri.email, userUri.bio)

    userUri.addBio()
    println(userUri.bio)

    userVasa.changePassword()
    println(userVasa.password)

    userUri.getAndSendTextToUser()
    userVasa.getAndSendTextToUser()
}

class User(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String,
) {

    fun printUserData(id: Int, login: String, password: String, email: String, bio: String) {
        println(
            "Данные пользователя $login, его id: $id, " +
                    "его пароль $password, и его почта: $email, его био: $bio"
        )
    }

    fun addBio() {
        println("Если хотите поменять информации в поле 'био' пользователя, введите его в следующую строку")
        bio = readln()
    }

    fun changePassword() {
        println("Введите свой текущий пароль:")
        val currentPassword: String = readln()
        if (currentPassword == password) {
            println("Введите новый пароль:")
            password = readln()
            println("Пароль изменен")
        } else {
            println("Текущий пароль указан неверно")
        }
    }

    fun getAndSendTextToUser() {
        println("Введите отправляемый текст")
        val text = readln()
        println("Будет отправлен текст $text")
    }
}