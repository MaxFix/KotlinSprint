package lesson_7

fun main() {
    println("Доброго времени суток! Введите количество секунд, которое нужно засечь:")
    val secondsCount = readln().toInt()

    for (i in secondsCount downTo 0) {
        Thread.sleep(1000)
        println(i)
    }
    println("Время вышло")
}