fun main() {
    val clientMoney: Int = 70_000
    val percents: Double =  16.7
    val years: Byte = 20
    val finalSum = clientMoney * (1 + (percents/100)) * years
    println(String.format("%.3f",finalSum))
}