package lesson_15

fun main() {
    val car1 = CargoCar(1, 2)
    val car2 = PassengerCar(3)
    val car3 = PassengerCar(2)

    car1.moving()
    car1.transportCargo()
    car1.transportPeople()
    println()
    car2.moving()
    car2.transportPeople()
    println()
    car3.moving()
    car3.transportPeople()
}

class CargoCar(
    private val numberOfPassengers: Byte,
    private val cargoQuantity: Byte,
) : Movable, CanTransportPeople, CanTransportCargo {
    override fun moving() {
        println("Грузовая машина едет")
    }

    override fun transportPeople() {
        println("Перевозит $numberOfPassengers человека")
    }

    override fun transportCargo() {
        println("Перевозит $cargoQuantity тонны груза")
    }

}

class PassengerCar(
    private val numberOfPassengers: Byte,
) : Movable, CanTransportPeople {
    override fun moving() {
        println("Легковая машина едет")
    }

    override fun transportPeople() {
        println("Перевозит $numberOfPassengers человека")
    }
}

interface Movable {
    fun moving()
}

interface CanTransportPeople {
    fun transportPeople()
}

interface CanTransportCargo {
    fun transportCargo()
}