package lesson1

class Lesson1Task2 {
    var ordersCount: Int  = 0
    val congratulationsMessage2: String = "Thank's for order for our shop! <3"
    var wokersCount: Int = 2000

    fun main() {
        println("var one: $ordersCount\nval two: $congratulationsMessage2")
        //println(wokersCount)
        wokersCount -= 1
        println(wokersCount)
    }
}