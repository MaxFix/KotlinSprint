package lesson_8

fun main() {
    println("Введите количество ингридиентов, которые хотите добавить")
    val ingredientsCount = readln().toInt()

    val listOfIngredients = Array(ingredientsCount) {
            println("Введите название ингридиента")
            readln()
        }

    println("Список добавленных элементов:")
    listOfIngredients.forEach { println(it) }
}