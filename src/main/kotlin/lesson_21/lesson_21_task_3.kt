package lesson_21

fun main() {
    val player1 = Player("Max", 12, 12)
    val player2 = Player("Wax", 1, 12)

    println(player1.isHealthy())
    println(player2.isHealthy())
}

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealth: Int,
)

fun Player.isHealthy(): Boolean {
    return maxHealth == currentHealth
}