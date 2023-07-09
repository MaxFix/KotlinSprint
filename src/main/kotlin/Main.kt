fun main() {
    val length: Long = 40_868_600_000
    val age: Byte = 27
    val partOfDay: Float = 0.075F
    val seconds: Short = 6480
    val partOfYear: Double = 2.0547945205479453E-4
    val apogee: Int = 327000

    val sumOfData =
        """
            Расстояние, которое пролетел Гагарин пока был в космосе в миллиметрах: $length
            Возраст Гагарина на момент полета: $age
            Какую часть дня Гагарин провел в космосе: $partOfDay
            Количество секунд которое Гагарин провел в космосе: $seconds
            Какую часть года Гагарин провел в космосе: $partOfYear
            Апогей орбиты Гагарина в метрах: $apogee
            """.trimIndent()
    println(sumOfData)


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