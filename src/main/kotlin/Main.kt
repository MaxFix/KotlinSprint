fun main() {
    val length: Long = 40_868_600_000
    val age: Byte = 27
    val partOfDay: Float = 0.075F
    val seconds: Int = 6480
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
}