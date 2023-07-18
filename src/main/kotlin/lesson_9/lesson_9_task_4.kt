package lesson_9

fun main() {
    println("Напишите 5 ингридиентов подряд, через запятую:")
    val ingredientsString = readlnOrNull()
    val ingredientsList: MutableList<String> = mutableListOf("")

    if (ingredientsString != null) {
        ingredientsList += ingredientsString
            .split(',')
            .sorted()
    }

    ingredientsList.forEach { println(it) }
}