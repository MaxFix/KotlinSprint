package lesson_16

private val MAX_HEALTH_COUNT = 30

fun main() {
    val player = Player("John", 10, 5)

    player.takingDamage(5)
    player.healing(2)
    player.takingDamage(6)
    player.healing(4)
    player.takingDamage(6)
    println("Здоровье игрока: ${player.healthCount}")
}

class Player(
    val name: String,
    var healthCount: Int,
    private var impactForce: Int,
) {
    private var isDead: Boolean = false

    fun takingDamage(damage: Int) {
        if (!isDead) {
            this.healthCount -= damage
        }
        if (healthCount <= 0) {
            this.healthCount = 0
            isDead = true
            death()
        }
    }

    fun healing(health: Int) {
        if (!isDead && healthCount <= MAX_HEALTH_COUNT) {
            this.healthCount += health
        }
    }

    private fun death() {
        impactForce = 0
        healthCount = 0
        println("Умер")
    }
}