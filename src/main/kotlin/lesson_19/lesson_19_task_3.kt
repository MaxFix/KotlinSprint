package lesson_19

fun main() {
    val ship = SpaceShip()
    ship.performAction(Action.DEFEND)
}

enum class Action {
    TAKE_OFF,
    LANDING,
    DEFEND
}
class SpaceShip {
    fun performAction(action: Action) {
        when(action) {
            Action.TAKE_OFF -> takeOff()
            Action.LANDING -> landing()
            Action.DEFEND -> TODO()
            else -> {
                error("Nothing")
            }
        }
    }
    private fun takeOff() {
        // TODO: здесь нужна информация о дополнительной логике
    }
    
    private fun landing() {
        println("Садимся")
    }
    
    fun defend() {
        throw (NotImplementedError("Метод требует доработки"))
    }
}