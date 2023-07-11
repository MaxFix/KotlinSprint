package lesson_3

import java.time.LocalDateTime

fun main() {
    val name = "Maksim"
    var greeting: String = "Добрый день, $name!"
    println(greeting)
    greeting = "Добрый вечер, $name!"
    println(greeting)
}