package lesson_10

fun main() {
    val humanFirstTry = rollOfTheDice()
    val humanSecondTry = rollOfTheDice()
    val robotFirstTry = rollOfTheDice()
    val robotSecondTry = rollOfTheDice()
    val humanSum = humanFirstTry + humanSecondTry
    val robotSum = robotFirstTry + robotSecondTry

    println("Первым бросает человечество: $humanFirstTry")
    println("Вторым бросает робот: $robotFirstTry")
    println("Третьим бросает человечество: $humanSecondTry")
    println("Четвертым бросает робот: $robotSecondTry")

    if (humanSum > robotSum) {
        println("Победило человечество")
    } else println("Победила машина")
}

fun rollOfTheDice(): Int {
    return (0 until 7).random()
}