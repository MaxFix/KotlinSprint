package lesson_20

fun main() {
    val player = Player("John", 15, 20)

    println("Текущий уровень здоровья ${player.currentHealth}")

    val healingPoison: () -> Unit = {player.currentHealth = player.maxHealth
    println("Пользователь использовал лечебное зелье и полностью восстановил здоровье")
    }

    healingPoison.invoke()

    println("Текущий уровень здоровья ${player.currentHealth}")
}

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
)