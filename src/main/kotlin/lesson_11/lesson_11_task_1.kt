package lesson_11

fun main() {
    val userVasa = User(123, "Vasa", "qwerty", "vasa@br.com")
    val userUri = User(321, "Uri", "strew", "ura@grade.uk")

    printUserData(userVasa.id, userVasa.login, userVasa.password, userVasa.email)
    printUserData(userUri.id, userUri.login, userUri.password, userUri.email)
}

fun printUserData(id: Int, login: String, password: String, email:String) {
    println("Данные пользователя $login, его id: $id, " +
            "его пароль $password, и его почта: $email")
}