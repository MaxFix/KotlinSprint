package lesson_9

fun main() {
    val ingredients: List<Int> = listOf(100, 25, 1)

    println("Сколько порций протеинового коктейля вы хотели бы приготовить?")
    val countOfPortion = readln().toInt()
    val newIngredients = ingredients.map {
        it * countOfPortion
    }

    println(
        "На $countOfPortion порций вам понадобится: \nпротеин - ${newIngredients.first()} гр.,\n" +
                "соевого молока – ${newIngredients[1]} мл.,\nбанан – ${newIngredients[2]} шт."
    )
}