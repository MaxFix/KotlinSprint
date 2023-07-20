package lesson_10


fun main() {
    var humanWinsCount = 0

    newRound()
    if (checkGameResult() > 0) {
        humanWinsCount++
    }

    do {
        val continueGame = continueGame()
        if (continueGame) {
            newRound()
            if (checkGameResult() > 0) {
                humanWinsCount++
            }
        }
    } while (continueGame)
    println("Количество побед человека: $humanWinsCount")
}

private fun continueGame(): Boolean {
    println("Хотите бросить кости ещё раз?\nВведите 'Да' или 'Нет'")
    val humanChoice = readln().lowercase()
    return humanChoice == "да"
}

fun rollOfTheDice(): Int {
    return (1..6).random()
}

fun newRound() {
    val humanTry = throwDice()
    val robotTry = throwDice()

    println("Первым бросает человечество: $humanTry")
    println("Вторым бросает робот: $robotTry")
}

fun throwDice(): Int {
    return rollOfTheDice() + rollOfTheDice()
}

fun checkGameResult(): Int {
    val humanWins = throwDice()
    val robotWins = throwDice()
    if (humanWins > robotWins) {
        return 1
    }
    return 0
}