package lesson_17

fun main() {
    val ship = Ship("Grom", 35, "Spb")
    ship.middleSpeed = 40
    ship.homePort = "Ptz"
    ship.name = "AnotherShip" //предупреждение в виде ошибки Val cannot be reassigned
}

class Ship(
    val name: String,
    var middleSpeed: Int,
    var homePort: String,
) {
    fun changeMiddleSpeed(speed: Int) {
        this.middleSpeed = speed
    }

    fun changeHomePort(port: String) {
        this.homePort = port
    }
}