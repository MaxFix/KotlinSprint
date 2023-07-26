package lesson_17

fun main() {
    val ship = Ship( 35, "Spb")
    ship.middleSpeed = 40
    ship.homePort = "Ptz"
    ship.name = "AnotherShip"
    println(ship.name)
}

class Ship(
    var middleSpeed: Int,
    var homePort: String,
) {
    var name: String = "Spb"
        set(value) {
            println("Имя корабля менять нельзя!")
        }
}