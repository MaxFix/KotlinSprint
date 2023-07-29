package lesson_20

fun main() {
    val username = "Денис"

    { it: String -> println("С наступающим Новым Годом, $username!") }(username)
}