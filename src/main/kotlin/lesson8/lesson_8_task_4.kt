package lesson8

fun main() {
    println("Текущий список ингридиентов:")
    val ingredients: MutableList<String> = mutableListOf("лук", "морковь", "помидор", "огурец", "соль")

    ingredients.forEach {
        println(it)
    }

    println("Здравствуйте! Напишите название ингридиента, который хотите заменить")
    val changedIngridient = readln()

    if (!ingredients.contains(changedIngridient)) {
        println("Такого ингридиента нет в списке")
    } else {
        ingredients.remove(changedIngridient)
        println("Введите ингридиент, который вы хотите добавить:")
        val newIngredient = readln()
        ingredients[ingredients.indexOf(changedIngridient)] = newIngredient
        println("Готово! Вы сохранили следующий список: ")
        ingredients.forEach { println(it) }
    }
}