package lesson_10

const val PASSWORD_LENGTH = 5

fun main() {
    println("Предлагаю зарегистрироваться в системе")
    println("Введите свой потенциальный логин: ")
    val login = registerLoginAndCheck()
    val password = passwordGenerate(PASSWORD_LENGTH)

    useAuth(login, password)
    authCode()
}

fun registerLoginAndCheck(): String {
    var login: String
    do {
        login = readln()
        println("Слишком короткий логин, минимальная длина 4 символа, попробуйте ввести снова")
    } while (login.length < PASSWORD_LENGTH)
    println("Ваш login: $login")
    return login
}

fun passwordGenerate(length: Int): String {
    val charset = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    var password = ""
    for (i in 1..length) {
        password += charset.random()
    }
    println("Ваш пароль: $password")
    return password
}

fun useAuth(login: String, password: String) {
    do {
        println("Введите зарегистрированный ранее логин: ")
        val enteredLogin = readln()
        println("Введите зарегистрированный ранее пароль: ")
        val enteredPassword = readln()

        val incorrectLoginPassword = enteredLogin != login || enteredPassword != password
        if (incorrectLoginPassword) {
            println("Логин или пароль введены неверно")
        } else {
            println("Авторизация прошла успешно")
        }
    } while (incorrectLoginPassword)
}

fun authCode() {
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