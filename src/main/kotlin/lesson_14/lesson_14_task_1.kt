package lesson_14

fun main() {
    val standartShip = StandardShip("Helion", 40, 1000)
    val cargoShip = CargoShip("BattleCruiser", 30, 4000)
    val iceBreakerShip = Icebreaker("Vessel", 60, 500)

    standartShip.printInfoAboutShip()
    cargoShip.printInfoAboutShip()
    iceBreakerShip.printInfoAboutShip()
}

open class StandardShip(
    private val name: String,
    private val speed: Int,
    private val loadCapacity: Int,
    val breakIce: Boolean = false,
) {
    fun printInfoAboutShip() {
        println("Имя корабля $name\nСредняя скорость корабля: $speed\n" +
                "Грузоподъемность корабля:$loadCapacity\nЛедокольность:$breakIce\n")
    }
}

class CargoShip(
    name: String,
    speed: Int,
    loadCapacity: Int,
): StandardShip(
    name, speed, loadCapacity
) {

}

class Icebreaker(
    name: String,
    speed: Int,
    loadCapacity: Int,
): StandardShip(
    name, speed, loadCapacity, breakIce = true
) {

}