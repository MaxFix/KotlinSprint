package lesson_9

import java.util.*

fun main() {
    val ingredients: MutableList<String> = mutableListOf("капуста", "морковь", "соль")
    println("В рецепте есть базовые ингредиенты:")
    ingredients.forEach{ println(it) }
    println("Желаете добавить еще?")
    val userChoose = readln()
    if (userChoose.lowercase(Locale.getDefault()) == "да") {
        println("Какой ингридиент вы хотите добавить?")
        val addIngredient = readln()
        ingredients += addIngredient
        ingredients.forEach{ println(it) }
    } else { return }
}