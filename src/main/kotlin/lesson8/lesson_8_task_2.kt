package lesson8

import java.util.*

fun main() {
    fun main() {
        val ingredients: Array<String> = arrayOf("морковь", "лук", "укроп", "горошек", "соль")

        println("Здравствуйте! Какой ингридиент вы хотели бы найти?")
        val userRequest = readln()
        for (i in ingredients) {
            if(userRequest.lowercase(Locale.getDefault()) == i) {
                println("Ингридиент $i в рецепте есть")
                return
            }
        }
        println("Ингридиента в рецепте нет")
    }
}