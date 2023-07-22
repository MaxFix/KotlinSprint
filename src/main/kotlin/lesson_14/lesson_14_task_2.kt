package lesson_14

fun main() {
    val standartShip = StandardShip1("Helion", 40, 1000)
    val cargoShip = CargoShip1("BattleCruiser", 30, 4000)
    val iceBreakerShip = Icebreaker1("Vessel", 60, 500)

    standartShip.printInfoAboutShip()
    println()
    cargoShip.printInfoAboutShip()
    cargoShip.becomeTheBase()
    println()
    iceBreakerShip.printInfoAboutShip()
    iceBreakerShip.canBreakIce()
}

open class StandardShip1(
    private val name: String,
    private val speed: Int,
    private val loadCapacity: Int,
    private val breakIce: Boolean = false,
) {
    fun printInfoAboutShip() {
        println("Имя корабля $name\nСредняя скорость корабля: $speed\n" +
                "Грузоподъемность корабля:$loadCapacity\nЛедокольность:$breakIce")
    }
}

class CargoShip1(
    name: String,
    speed: Int,
    loadCapacity: Int,
    private val canBeBase: Boolean = true,
): StandardShip(
    name, speed, loadCapacity
) {
    fun becomeTheBase() {
        println("Становится базой: $canBeBase")
    }
}

class Icebreaker1(
    name: String,
    speed: Int,
    loadCapacity: Int,
): StandardShip(
    name, speed, loadCapacity, breakIce = true
) {
    fun canBreakIce() {
        println("Колоть лёд: $breakIce")
    }
}