package lesson_9

fun main() {
    val ingredients: List<String> = listOf("соль", "сахар", "лук", "чеснок", "перец")
    println("В рецепте есть следующие ингредиенты: ")

    ingredients.forEach{println(it)}
}