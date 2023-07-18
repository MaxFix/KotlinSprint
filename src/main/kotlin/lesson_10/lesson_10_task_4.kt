package lesson_10


fun main() {
    var humanWins = 0 //??
    newRound()
    println("Хотите бросить кости ещё раз?\nВведите 'Да' или 'Нет'")
    do {
        val answer = readln()
        if (answer.lowercase() == "нет") {
            break
        }
        newRound()
        if (newRound() > 0) {
            humanWins += 1
        }
    } while (answer.lowercase() == "да")
    println("количество побед человека $humanWins")
}

fun rollOfTheDice(): Int {
    return (0 until 7).random()
}

fun newRound(): Int {
    val humanTry = rollOfTheDice() + rollOfTheDice()
    val robotTry = rollOfTheDice() + rollOfTheDice()

    println("Первым бросает человечество: $humanTry")
    println("Вторым бросает робот: $robotTry")
    return humanTry - robotTry
}


