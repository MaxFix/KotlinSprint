package lesson_19

fun main() {
    val tank = Tank()
    tank.shoot(Cartridges.BLUE)
    tank.reloadCartridges()
    tank.shoot(Cartridges.RED)
}

enum class Cartridges(val power: Int) {
    BLUE(5),
    GREEN(10),
    RED(15),
}


class Tank {

    private fun performAction(cartridge: Cartridges) {
        when(cartridge) {
            Cartridges.BLUE -> println("Нанесём урон ${cartridge.power}")
            Cartridges.GREEN -> println("Нанесём урон ${cartridge.power}")
            Cartridges.RED -> println("Нанесём урон ${cartridge.power}")
            else -> {
                println("Орудие заклинило")
            }
        }
    }

    fun reloadCartridges() {
        println("Меняем тип патронов")
    }

    fun shoot(cartridge: Cartridges) {
        return performAction(cartridge)
    }
}