package lesson_5

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2023
fun main() {
    println("Введите свой год рождения: ")
    val yearOfBirth = readln().toInt()
    var numberOfYears: Int = CURRENT_YEAR - yearOfBirth

    val resultText = if (numberOfYears >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else if (numberOfYears == 16 || numberOfYears == 17) "Показать экран с ограниченным контентом"
    else "Вернуться на главный экран"

    println(resultText)
}