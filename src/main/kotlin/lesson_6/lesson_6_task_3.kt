package lesson_6

const val START_MESSAGE_FOR_USER_6 = "Сколько секунд вы хотите засечь?"
fun main() {
    println(START_MESSAGE_FOR_USER_6)
    var secondsCount: Int = readln().toInt()
    while (secondsCount > 0) {
        Thread.sleep(1000)
        println("Осталось секунд: $secondsCount")
        secondsCount--
    }
    println("Время вышло")
}