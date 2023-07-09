fun main() {

    val year: Int = 1961
    var hour: Int = 9
    var minute: Int = 7

    println("Время полета Гагарина в космос: \n$year год \n$hour часов \n$minute минут")
    hour = 10
    minute = 55
    println("Время прибытия Гагарина из космоса(посадки): \n$year год \n$hour часов \n$minute минут")

    var ordersCount: Int  = 0

    val congratulationsMessage2: String = "Thank's for order for our shop! <3"
    var workersCount: Int = 2000

    println("var one: $ordersCount\nval two: $congratulationsMessage2")
    //println(workersCount)
    workersCount -= 1
    println(workersCount)

    var congratulationsMessage: String = "Thank's for order for our shop! <3"
}