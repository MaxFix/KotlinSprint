package lesson_8


fun main() {
        val ingredients: Array<String> = arrayOf("морковь", "лук", "укроп", "горошек", "соль")

        println("Здравствуйте! Какой ингридиент вы хотели бы найти?")
        val userRequest = readln()
        if (userRequest in ingredients) println("Ингридиент $userRequest в рецепте есть")
        else println("Ингридиента в рецепте нет")
    }