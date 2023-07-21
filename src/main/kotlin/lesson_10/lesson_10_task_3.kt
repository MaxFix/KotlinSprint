package lesson_10

fun main() {
    println("Введите длину желаемого пароля:")
    val length = readln().toInt()
    println("Ваш пароль:${passwordGenerator(length)}")
}

fun passwordGenerator(length: Int): String {
    var password = ""

    for(i in 0 until  length) {
        val specialCharacters = ('#'..'&').random()
        val charset = ('0'..'9').random()
        password += if (password.length < length && i % 2 == 0) {
            specialCharacters
        } else {
            charset
        }
    }
    return password
}