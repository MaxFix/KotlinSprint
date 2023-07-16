package lesson8

fun main() {
    println("Текущий список ингридиентов:")
    var ingridients: Array<String> = arrayOf("лук", "морковь", "помидор", "огурец", "соль")

    ingridients.forEach {
        println(it)
    }

    println("Здравствуйте! Напишите название ингридиента, который хотите заменить")
    val changedIngridient = readln()

    if (!ingridients.contains(changedIngridient)) {
        println("Такого ингридиента нет в списке")
    } else {
        println("Введите ингридиент, который вы хотите добавить:")
        val newIngridient = readln()
        ingridients += newIngridient
        println("Готово! Вы сохранили следующий список: ")
        ingridients.forEach { println(it) }
    }
}