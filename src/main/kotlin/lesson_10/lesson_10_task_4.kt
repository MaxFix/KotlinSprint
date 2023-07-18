package lesson_10


fun main() {
    var humanWins = 0 //??
    newRound()
    println("Хотите бросить кости ещё раз?\nВведите 'Да' или 'Нет'")
    do {
        val answer = readln()
        if (answer.lowercase() == "нет") {
            println("Человек выиграл $ партий")
            break
        }
        newRound()
    } while (answer.lowercase() == "да")
}

fun rollOfTheDice(): Int {
    return (0 until 7).random()
}

fun newRound() {
    val humanTry = rollOfTheDice() + rollOfTheDice()
    val robotTry = rollOfTheDice() + rollOfTheDice()

    println("Первым бросает человечество: $humanTry")
    println("Вторым бросает робот: $robotTry")

}
