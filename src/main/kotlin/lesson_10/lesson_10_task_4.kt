package lesson_10

fun main() {
    var humanWinsCount = 0
    var continueGame = true

    while (continueGame) {
        val humanTry = throwDice() + throwDice()
        val robotTry = throwDice() + throwDice()
        val result = checkGameResult(humanTry, robotTry)

        newRound(humanTry, robotTry)

        if (result > 0) {
            humanWinsCount++
        }
        continueGame = continueGame()
    }
    println("Количество побед человека: $humanWinsCount")
}
private fun continueGame(): Boolean {
    println("Хотите бросить кости ещё раз?\nВведите 'Да' или 'Нет'")
    val humanChoice = readln().lowercase().trim()
    return humanChoice == "да"
}

fun newRound(humanTry: Int, robotTry: Int) {
    println("Первым бросает человечество: $humanTry\nВторым бросает робот: $robotTry")
}

fun throwDice(): Int {
    return (1..6).random()
}

fun checkGameResult(humanWins: Int, robotWins: Int): Int {
    if (humanWins > robotWins) {
        return 1
    }
    return 0
}