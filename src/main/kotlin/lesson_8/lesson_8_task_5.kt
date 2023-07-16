package lesson_8

fun main() {
    println("Введите количество ингридиентов, которые хотите добавить")
    val ingredientsCount = readln().toInt()
    var listOfIngredients: Array<String> = arrayOf()

    for(i in 0 until ingredientsCount) {
        println("Введите название ингридиента")
        val ingredient = readln()
        listOfIngredients += ingredient
    }

    println("Список добавленных элементов:")
    listOfIngredients.forEach { println(it) }
}