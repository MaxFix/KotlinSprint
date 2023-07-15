package lesson_6

const val START_MESSAGE_FOR_USER = "Сколько секунд вы хотите засечь ?"
fun main() {
    println(START_MESSAGE_FOR_USER_6)
    val secondsCount: Int = readln().toInt()
    var counter: Int = 0
    do {
        Thread.sleep(1000)
        counter++
    } while (counter < secondsCount)
    println("Прошло $secondsCount секунд")
}