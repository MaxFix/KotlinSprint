package lesson_8

fun main() {
    val views: Array<Int> = arrayOf(12, 30, 19, 70, 42)
    var sum = 0

    views.forEach {
        sum += it
    }

    println(sum)
}