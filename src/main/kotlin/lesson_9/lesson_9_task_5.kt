package lesson_9

import java.util.*

const val INGREDIENTS_COUNT = 5

fun main() {
    var array = Array(INGREDIENTS_COUNT) {
        readln()
    }
    var newString = ""

    array = array.toSet().sorted().toTypedArray()
    array.forEach { newString += "$it," }
    newString = newString.dropLast(1) + "."
    println(newString.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })
}