package lesson_10

fun main() {
    println("Введите длину желаемого пароля:")
    val length = readln().toInt()
    println("Ваш пароль:${passwordGenerator(length)}")
}

fun passwordGenerator(length: Int): String {
    var password = ""
    var counter = length

    while (counter > 0) {
        val specialCharacters = ('#'..'&').random()
        val charset = ('0'..'9').random()
        if (password.length < length && counter % 2 == 0) {
            password += specialCharacters
            counter--
        }
        else {
            password += charset
            counter--
        }
    }
    return password
}