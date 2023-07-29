package lesson_20

fun main() {
    val player = Player2("Boris")

    val haveKey: () -> Unit = {
        if (player.hasKey) {
            println("Вы открыли дверь")
        } else {
            println("У Вас нет ключа")
        }
    }

    haveKey()
    player.hasKey = true
    haveKey()
}

class Player2(val name: String, var hasKey: Boolean = false)